package workshop.account.exception;

/*
 * Account의 잔액(balance)이 부족할 때 사용되는 사용자 정의 Exception 클래스 * 
 */

public class InsufficientBalanceException extends Exception{
	private int currentBalance;
	
	public InsufficientBalanceException(String errMessage, int currentBalance) {
		super(errMessage);
		this.currentBalance = currentBalance;
	}
	
	public int getCurrentBalance() {
		return currentBalance;
	}
}
