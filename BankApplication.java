package Interface;

public class BankApplication
{
	public static void main(String[]args)
	{
		Bank bank=new BankImp();
		Account account=new Account(12345678,"abcd",155000,bank);
		
		account.deposit(2000);
		System.out.println(account);
		
		account.withdraw(10000);
		System.out.println(account);
	}
}
