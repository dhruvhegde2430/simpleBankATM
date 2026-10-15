package bankaccount;

public class Account {
	
	private String number;
	private double balance;
	private String name; 
	private String mail; 
	private String PhoneNumber;
	

	
	
	public Account(String number, double balance, String name, String mail, String phoneNumber) {
		super();
		this.number = number;
		this.balance = balance;
		this.name = name;
		this.mail = mail;
		PhoneNumber = phoneNumber;
	}


	public void DepositMoney(double DepositedMoney) {
		this.balance = this.balance + DepositedMoney;
		System.out.println("Deposit Successful! New Balance: " + this.balance);
	}
	
	
	public void WithdrawMoney(double WithdrawMoney) {
		if (this.balance - WithdrawMoney < 0) { 
			System.out.println("Withdraw Failed. Please try again");
		} else { 
			this.balance = this.balance - WithdrawMoney;
			System.out.println("Withdraw Successful! New Balance: " + this.balance);
		}
		
	}
	
	

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mmail) {
		mail = mmail;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	
	
	

}
