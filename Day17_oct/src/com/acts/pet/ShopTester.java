package com.acts.pet;

import java.util.List;
import java.util.Scanner;

import javax.naming.AuthenticationException;

public class ShopTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<Pet>
		int  choice =0;
		int menuoption=1;
		boolean isLogin = false ;
		do {
			System.out.println("*******MENU******* \n "
					+ "1. login crdentials\n "
					+ "2. add new pet \n "
					+ "3. update pet details \n"
					+ "4. Display all available pets \n "
					+ "5. order a pet \n "
					+ "6. Check order status by orderId \n "
					+ "7. Update order status \n "
					+ "8. Logout \n"
					+ "0. Exit");

			menuoption=sc.nextInt();
			switch(menuoption) {
			case 1: {
				try {
					System.out.println("ENTER YOUR IDENTITY\n 1. admin \n 2. customer");
					choice =sc.nextInt();
					System.out.println("enter login id and password");
					String id = sc.next();
					String pass = sc.next();

					if (choice==1) {
						if (id.equalsIgnoreCase("admin")&& pass.equalsIgnoreCase("admin")) {
							System.out.println("Welcome Admin");
							isLogin = true ;
							break ;
						}
					}
					else if (choice ==2 ) {
						if (id.equalsIgnoreCase("c1")&& pass.equalsIgnoreCase("c1")) {
							System.out.println("Welcome customer");
							isLogin = true ;
							break;
						}
					}
					throw new AuthenticationException("Please Enter valid credentials!!!!!");

				} catch (AuthenticationException e) {
					e.printStackTrace();
				}
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
						Pet.plist.add(p) ;


					}else {
						throw new AuthenticationException("You are not authenticated");
					}

				} catch (AuthenticationException e) {
					e.printStackTrace();
				}

			}break;
			case 3: {
				try {
					if (choice== 1 && isLogin == true )
					{
						System.out.println("Enter pet id");
						int pId =sc.nextInt() ;
						Pet p = Pet.findByID(pId) ;
						if(p!=null) {
							System.out.println("Enter updated pet unitprice");
							int unitprice =sc.nextInt() ;
							p.setUnitprice(unitprice);
							System.out.println("Enter updated pet stock");
							int stock =sc.nextInt() ;
							p.setStock(stock+p.getStock());
						}else {
							System.out.println("Pet not found");
						}
					}else {
						throw new AuthenticationException("You are not authenticated");
					}
				} catch (AuthenticationException e) {
					e.printStackTrace();
				}

			}break;
			case 4: {
				try {
					if(isLogin==false) {
						throw new AuthorizationExcep("You are not logged in please login first");
					}
					System.out.println(Pet.plist);
				} catch (AuthorizationExcep e) {
					e.printStackTrace();
				}
			}break;
			case 5: {
				try {
					if(isLogin==false) {
						throw new AuthorizationExcep("You are not logged in please login first");
					}
					System.out.println("Enter pet id you want to order");
					int pId =sc.nextInt() ;
					Pet p = Pet.findByID(pId) ;
					if(p!=null) {
						System.out.println("Enter Quantities you want to order");
						int q =sc.nextInt() ;
						if(q>p.getStock()) {
							System.out.println("unavailable pet quantities");
						}else {
							Order o = new Order(pId, q);
							Order.olist.add(o);
							System.out.println(o);;
							
						}

					}else {
						System.out.println("Enter valid Pet ID");
					}

				} catch (AuthorizationExcep e) {
					e.printStackTrace();
				}

			}break;
			case 6: {
				try {
					if(isLogin==false) {
						throw new AuthorizationExcep("You are not logged in please login first");
					}
					//System.out.println(Pet.plist);
					System.out.println("Enter order ID");
					int oid = sc.nextInt() ;
					System.out.println(Order.checkStatus(oid));
				} catch (AuthorizationExcep e) {
					e.printStackTrace();
				}
			}break;
			case 7:{
				try {
					if (choice== 1 && isLogin == true )
					{
						System.out.println("Enter order id you want to update");
						int oid = sc.nextInt() ;
						System.out.println("Enter status you want to change ");
						Status s = Status.valueOf(sc.next()) ;
						if(Order.updateStatus(oid, s)) {
							System.out.println("Your Status has been updated");
							break ;
						}
						System.out.println("You have entered wrong order ID");
					}else {
						throw new AuthenticationException("You are not authenticated");
					}

				} catch (AuthenticationException e) {
					e.printStackTrace();
				}
			}break;
			case 8:{
				isLogin =false ;
			}break;
			}


		}while (menuoption!=0);

System.out.println("THANK YOU VISIT AGAIN !!!!!");



	}

	
}



