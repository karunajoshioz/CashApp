
public class CashApp
{
    public static void main (String[] args)
    {
    	Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", 0.00);
		
		// display initial balance of each object
		System.out.printf("%s balance: $%.2f%n",
			account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",
			account2.getName(), account2.getBalance());
	
		
		System.out.print("Deposit $100 to  account1 \n"); // prompt
		double depositAmount = 100.00;//input.nextDouble(); // obtain user input
		account1.deposit(depositAmount); // add to acount1's balance
		
		System.out.print("Enter $50 to account2 \n"); // prompt
		depositAmount = 50.00;//input.nextDouble(); //obtain user input
		account2.deposit(depositAmount); 
		
		
		// display balances
		System.out.printf("%s balance: $%.2f%n",
			account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",
			account2.getName(), account2.getBalance());
			
	
		
		System.out.print("Withdraw $200 from account1 \n ");
		double withdrawalAmount = 200;//input.nextDouble(); // obtain user input
		account1.withdrawal( withdrawalAmount ); // subtract from account
		
		System.out.printf("%s balance: $%.2f%n",
				account1.getName(), account1.getBalance());
			System.out.printf("%s balance: $%.2f%n%n",
				account2.getName(), account2.getBalance());
			
		System.out.println("Total Bank Balance:"+ (account1.getBalance() +
							account2.getBalance()));
	} // end main

}