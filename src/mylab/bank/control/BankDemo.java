package mylab.bank.control;

import mylab.bank.entity.Account;
import mylab.bank.entity.Bank;
import mylab.bank.entity.SavingsAccount;

public class BankDemo {

	public static void main(String[] args) {
		Bank bank = new Bank();
		try {
			System.out.println("=== 계좌 생성 ===");
			bank.createSavingAccount("홍길동", 10000, 3.0);
			bank.createCheckingAccount("김철수", 20000, 5000);
			bank.createSavingAccount("이영희", 30000, 2.0);
			
			bank.printAllAccounts();
			
			System.out.println("=== 입금/출금 테스트 ===");
			Account acc = bank.findAccount("AC1000");
			acc.deposit(5000);
			
			Account acc2 = bank.findAccount("AC1001");
			acc.withdraw(3000);
			
			System.out.println("=== 이자 적용 테스트 ===");
			SavingsAccount sa = (SavingsAccount) acc;
			sa.applyInterest();
			
			System.out.println("=== 계좌 이체 테스트 ===");
			bank.transfer("AC1002", "AC1001", 5000);
			
			bank.printAllAccounts();
			
			acc2.withdraw(6000);
			bank.findAccount("AC9999");
		}catch(Exception e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
	}
}
