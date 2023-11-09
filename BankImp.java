package Interface;

public class BankImp implements Bank
{
	public void deposit(Account account,double amount)
	{
		if(amount>DEPOSIT_LIMIT)
			System.err.println("Deposit is not possible..exceed deposit limit");
		else
			account.setBalance(account.getBalance()+amount);
			System.out.println("deposited"+amount+"into account:"+account.getAccNo());
	}
	public void withdraw(Account account,double amount)
	{
		if(account.getBalance() - amount>=MIN_BALANCE)
		{
			account.setBalance(account.getBalance()-amount);
			System.out.println("Withdrawn:"+amount+"form account:"+account.getAccNo());
		}
		else
			System.out.println("Insufficient balance in accoun");
	}
	

}
