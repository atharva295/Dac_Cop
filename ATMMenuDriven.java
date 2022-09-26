import java.util.*;

public class ATMMenuDriven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		int pin = 368 ;

		while(true) {
			System.out.println("Enter user credentials");
			int cardNumber = sc.nextInt();
			if(cardNumber>=1000 && cardNumber<=9999) {
				System.out.println("Enter Your pin");
				int pinc = sc.nextInt();
				if(pinc == pin) {
					System.out.println("Welcome");
					System.out.println("Choose from the below given options");
					System.out.println(" 1. Check Balance");
					System.out.println(" 2. Withdrawl Amount");
					System.out.println(" 3. Credit Amount");
					System.out.println(" 4. Update your details");

					int option = sc.nextInt() ;
					int option2 ;
					
					switch(option) {
					case 1:System.out.println("Your Balance is 400000");
					break ;
					
					case 2:System.out.println("How much amount you want to withdraw");
					int amount=sc.nextInt();
					System.out.println("your amount of rupees"+amount+ "is withdrawl");
					break ;
					
					case 3:System.out.println("How much amount you want to credit");
					int amountc=sc.nextInt();
					System.out.println("your amount of rupees " +amountc+ "is credited");
					break ;
					
					case 4:
						System.out.println("Choose from the below given options");
						System.out.println(" 1. Update your mobile number ");
						System.out.println(" 2. Update your pin ");
						//System.out.println(" 3. Update your Email ID");
						option2 = sc.nextInt() ;
						switch(option2) {
						case 1: 
							System.out.println("Enter your Mobile number");
							long mono = sc.nextLong() ;
							System.out.println("your Entered Mobile number is "+mono);
							break ;
						case 2:
							System.out.println("Enter Your Pin");
							pin =  sc.nextInt() ;
							System.out.println("Your Pin is Updated Successfully");
							break ;
						default:
							System.out.println("Invalid Input");
						}
						break ;
					default:
						System.out.println("Invalid Input");	

					}
					
					
				//char a = sc.next().charAt(0);
					

				}
				else {
					System.out.println("Wrong Pin ");
				}
			}
			else{
				System.out.println("Wrong Credentials Please Enter again");
			}
			
			

		}


	}

}
