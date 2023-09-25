package com.acts.booklib;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;



public class BookTester {

	public static void main(String[] args) {
 
		HashSet<Book> library = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int choice =0;
		
		
		do {
		
			System.out.println("*************WELCOME TO THE LIBRARY**********");
			
			System.out.println("1. Add book");
			System.out.println("2. Display all the book");
			System.out.println("3. Allot Book to the Student ");
			System.out.println("4. Take Book Return ");
			System.out.println("5. Sort by title)");
			System.out.println("6. Exit ");
			
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			switch(choice) {
			//String title, String price, String publsishedDate, String authorName, int quantity, String book
			case 1: 
//				System.out.println("Enter the unique id of book");
//				Integer id = sc.nextInt();
				System.out.println("Enter the title of book");
				String title = sc.next();
				
				System.out.println("Enter the publishedDate of book");
				String publishingdate = sc.next();
				LocalDate pdate = null ;
				pdate = pdate.parse(publishingdate) ;
				
				System.out.println("Enter the authorName of book");
				String authorname = sc.next();
				 
				System.out.println("Enter the Quantity of Books you want to add");
				int qty =sc.nextInt();
				
				System.out.println("Enter the bookType of book");
				BookType bookType = BookType.valueOf(sc.next());
				
				System.out.println("Enter the price of book");
				int price = sc.nextInt();
				Book b = new Book(title, price, pdate, authorname, qty, bookType) ;
				library.add(b);
				
			break;
			
			case 2:
				System.out.println("the available bookes are");
				for(Book bz:library) {
					System.out.println(bz);
				}break;
				
			case 3: 
				System.out.println("enter the book title which you want");
				String want = sc.next();
				for(Book wt :library) {
					if(want.equals(wt.getTitle())) {
					wt.setQuantity(wt.getQuantity()-1);
					break;
					}
				}
				break;
				
			case 4:
				System.out.println("enter the book title you want to return");
				String rtrn = sc.next();
				for(Book vps : library) {
					if(rtrn.equals(vps.getTitle())) {
						vps.setQuantity(vps.getQuantity()+1);
					}
				}
				break;
				
			case 5:
				TreeSet<Book> books = new TreeSet<>(library);
				System.out.println(books);
				for(Book s :books) {
					System.out.println(s);
				}
				
					break;
				
				
			case 8:
				System.out.println("Thank you for using library service");
				System.exit(0);
				break;
				
			}
		}while(choice != 0);
		
	}

}
