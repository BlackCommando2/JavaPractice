class RBI {
	public float interestRate;
	public void setInterestRate()
	{
		interestRate = 6.5f;
	}
	
	public float getInterestRate()
	{
		return interestRate;
	}
}

class SBI extends RBI{
	public float interestRate;
	public void setInterestRate()
	{
		interestRate = 7.0f;
	}
	
	public float getInterestRate()
	{
		return interestRate;
	}
}

public class BankSystem {

	public static void main(String[] args) {
		RBI r = new RBI();
		SBI s = new SBI();
		r.setInterestRate();
		System.out.println(r.getInterestRate());
		s.setInterestRate();
		System.out.println(s.getInterestRate());

	}

}
