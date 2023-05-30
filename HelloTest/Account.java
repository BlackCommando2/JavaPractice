
public class Account 
{
	private String holderName;
	private int Balance;
	
	Account()
	{
		holderName = "placeHolder";
		Balance = 0;
	}
	
	Account(String accName, int bal)
	{
		this.holderName = accName;
		this.Balance = bal;
	}
	
	public String getName() 
	{
		return holderName;
	}

	public void setName(String newName) 
	{
		this.holderName = newName;
	}
	
	public int getBalance() 
	{
		return Balance;
	}

	public void setBalance(int newBalance) 
	{
		this.Balance = newBalance;
	}
	
	public int withdrawal(int amt) 
	{
		if(amt>=Balance)
		{
			System.out.println("Insufficient Balance");
			return -1;
		}
		Balance -= amt;
		if(Balance<1000)
		{
			System.out.println("Cannot Withdraw as minimum Balance Should be 1000");
			Balance += amt;
			return Balance;
		}
		return Balance;
	}
	
	public int deposit(int amt) 
	{
		
		Balance += amt;
		return Balance;
	}
	
	@Override
	public String toString() {
		return("Account Holder: "+ this.getName()+" Balance: "+this.getBalance());
	}
}
