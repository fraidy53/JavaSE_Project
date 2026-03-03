package workshop.account.entity;

import workshop.account.exception.InsufficientBalanceException;

public class Account extends Object {
	private String custId;
	private String acctId;
	private int balance;
	
	// Default Constructor 기본 생성자
	public Account() {
		System.out.println(this.getClass().getName() + " 기본생성자 호출됨");
	}
	
	// Constructor Overloading(중복 정의)
	public Account(String custId, String acctId) {
		setCustId(custId);
		setAcctId(acctId);
	}

	
	// setter method (멤버변수 값 변경)
//	private void setBalance(int balance) {
//		this.balance = balance;
//	}
	
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	

	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	// getter method (멤버변수 값 조회)
	public String getCustId() {
		return custId;
	}

	public String getAcctId() {
		return acctId;
	}

	public int getBalance() {
		return balance;
	}
	
	// 입금
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	// 출금
	// AccountTest에서 try/catch를 하도록 위임하는 것
	public void withdraw(int amount) throws InsufficientBalanceException {
		if(amount > balance) {
			// Exception을 강제로 발생
			throw new InsufficientBalanceException("잔액이 부족합니다. 현재잔액은= ", balance);
		}
		this.balance -= amount;
	}
	
	// 메서드 재정의(Overriding) 
	// 부모 클래서의 메서드 선언은 반드시 같아야하고, 구현만 다름
	// 메서드 위에서 선언하는 어노테이션, 컴파일 타임에서  도앚ㄱ하는 어노테이션
	@Override
	public String toString() {
		return "Account [고객번호=" + custId + ", 계좌번호=" + acctId + ", 잔액=" + balance + "]";
	}
	
}

