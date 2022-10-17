package com.acts.pet;

import java.util.List;
import java.util.Scanner;

import javax.naming.AuthenticationException;

public class ShopTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<Pet>
		int  choice =0;
		int menuoption=0;
		boolean isLogin = false ;
		do {
			System.out.println("*******MENU******* \n "
					+ "1. login crdentials\n "
					+ "2. add new pet \n "
					+ "3. update pet details \\n"
					+ "4. Display all available pets \n "
					+ "5. order a pet \n "
					+ "6. Check order status by orderId \n "
					+ "7. Update order status \n "
					+ "8. exit");

			menuoption=sc.nextInt();
			switch(menuoption) {
			case 1: {

				System.out.println("ENTER YOUR IDENTITY\n 1. admin \n 2. customer");
				choice =sc.nextInt();
				System.out.println("enter login id and password");
				String id = sc.next();
				String pass = sc.next();
				if (choice==1) {
					if (id=="admin"&& pass == "admin") {
						System.out.println("Welcome Admin");
						isLogin = true ;
						break ;
					}
				}
				else if (choice ==2 ) {
					if (id == "c1"&& pass == "c1") {
						System.out.println("Welcome customer");
						isLogin = true ;
						break;
					}
				}
				System.out.println("Please Enter valid credentials!!!!!");
			}break;
			case 2:{
				try {
					if (choice== 1 && isLogin == true )
					{
						System.out.println("Enter pet id");
						int petId =sc.nextInt() ;
						System.out.println("Enter pet name");
						String name =sc.next() ;
						System.out.println("Enter pet category");
						Category category = Category.valueOf(sc.next()) ;
						System.out.println("Enter pet unitprice");
						int unitprice =sc.nextInt() ;
						System.out.println("Enter pet stock");
						int stock =sc.nextInt() ;
						Pet p = new Pet(petId, name, category, unitprice, stock);
						
						
						
					}else {
						throw new AuthenticationException("You are not authenticated");
					}
					
				} catch (AuthenticationException e) {
					e.printStackTrace();
				}
				
			}break;
			case 3: {

			}break;
			case 4: {

			}break;
			case 5: {

			}break;
			case 6: {

			}break;
			case 7:{

			}break;
			}


		}while (choice!=0);





	}
}



