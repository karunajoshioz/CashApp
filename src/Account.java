public class Account
{
	private String name; // instance variable
	private double balance; // instance variable
	
	public Account(String name, double balance)
	{
		this.name = name; // assign name to instance variable name
		
		//validate that the balance is greater that 0.0; if it's not,
		// instance variable balance keeps its default initial value of 0.0
		if (balance > 0.0) // if the balance if valid
			this.balance = balance; // assign it to instance variable balance
	}
	
	// method that depostits (adds) only a valid ammount to the balance
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0) // if the depositAmount is valid
			balance = balance + depositAmount; // add it to the balance
	}
	
	public void withdrawal(double withdrawalAmount)
	{
		if (withdrawalAmount < 0.0) // if the withdrawal is invalid
			balance = balance - withdrawalAmount; // subtract it from the balance
		else 
		System.out.print("Withdrawal amount exceeded account balance.");
	}	// end method withdrawal
	

	// method returns the account balance
	public double getBalance()
	{
		return balance;
	}
	
	// method that sets the name
	public void setName(String name)
	{
		this.name = name;
	}

	// method that returns the name
	public String getName(){
		return this.name; // give value of name back to caller
	} // end method getName
	
} // end Class Account