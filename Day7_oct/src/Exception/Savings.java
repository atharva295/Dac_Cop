package Exception;
import java.util.Scanner;
public class Savings  extends Account 
{
	public static final double MIN_BALANCE=1000.00;
	private int currBal;

	public Savings(String name, long accNumber,  int currBal) {
		super.accNumber = accNumber ;
		super.name =name ;
		this.currBal = currBal ;
	}
	public int withdraw(int amount) throws  MinBalanceExc{
		try {
			if(currBal-amount<MIN_BALANCE) { 
				MinBalanceExc  me = new MinBalanceExc("Request declined ");
			throw me;
			}
		}catch (MinBalanceExc me) {
			me.printStackTrace();
		}
			return currBal;
	}
}
