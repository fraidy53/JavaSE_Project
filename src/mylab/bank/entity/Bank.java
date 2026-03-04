package mylab.bank.entity;

import java.util.ArrayList;

import javax.security.auth.login.AccountNotFoundException;

public class Bank {
	private ArrayList<Account> accounts;
	private int nextAccountNumber = 1000;
	
	public Bank() {
		accounts = new ArrayList<>();
	}
	
	private String generateAccountNumber() {
		return "AC" + (nextAccountNumber++);
	}
	
	public void createSavingAccount(String owner, double balance, double rate) {
		Account acc = new SavingsAccount(generateAccountNumber(), owner, balance, rate);
		accounts.add(acc);
		System.out.println("저축 계좌가 생성되었습니다: " + acc);
	}
	
	public void createCheckingAccount(String owner, double balance, double limit) {
        Account acc = new CheckingAccount(generateAccountNumber(), owner, balance, limit);
        accounts.add(acc);
        System.out.println("체킹 계좌가 생성되었습니다: " + acc);
    }
	
	public Account findAccount(String accountNumber) 
            throws AccountNotFoundException {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        throw new AccountNotFoundException(
                "계좌번호 " + accountNumber + "에 해당하는 계좌를 찾을 수 없습니다.");
    }

    public void transfer(String from, String to, double amount)
            throws Exception {

        Account fromAcc = findAccount(from);
        Account toAcc = findAccount(to);

        fromAcc.withdraw(amount);
        toAcc.deposit(amount);

        System.out.println(amount + "원이 " + from + "에서 " + to + "로 송금되었습니다.");
    }

    public void printAllAccounts() {
        System.out.println("=== 모든 계좌 목록 ===");
        for (Account acc : accounts) {
            System.out.println(acc);
        }
        System.out.println("===================");
    }
}
