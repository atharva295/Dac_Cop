package Exception;
import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) throws MinBalanceExc {
		String name= "" ;
		long accNumber= 21134543 ;
		int amount= 1000;
		
		
		Savings ands =new Savings(name,accNumber,amount) ;
		System.out.println(ands);
		
		int w= 2000 ;
		
			System.out.println(ands.withdraw(w));
		
	}

}




