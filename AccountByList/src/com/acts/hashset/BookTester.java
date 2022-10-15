package com.acts.hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class BookTester {

	public static void main(String[] args) {
 
		HashSet<Book> library = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int choice =0;
		
		
		do {
		
			System.out.println("WELCOME TO THE LIBRARY");
			System.out.println("1. Add book");
			System.out.println("2. Display all the book");
			System.out.println("3. Allot Book to the Student (quantity -1)");
			System.out.println("4. Take Book Return (quantity +1)");
			System.out.println("5. Sort by title)");
			System.out.println("6. Exit ");
			
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			switch(choice) {
			//String title, String price, String publsishedDate, String authorName, int quantity, String book
			case 1: 
			//	System.out.println("Add the book title");
			Book b1 = new Book("Core Java", "500", "10-10-2011", "james gosling", 1200, "Java");
			Book b2 = new Book("Two States", "600", "11-10-2015", "Chetan Bhagat", 800, "Romantic");
			Book b3 = new Book("nights", "450", "12-10-2012", "kapil", 900, "Comedy");
			Book b4 = new Book("thunder", "900", "05-12-2012", "john palker", 300, "Action");
			Book b5 = new Book("thunder", "900", "05-12-2012", "john palker", 300, "Action");
			Book b6 = new Book("thunder", "900", "05-12-2012", "john palker", 300, "Action");
			library.add(b1);
			library.add(b2);
			library.add(b3);
			library.add(b4);
			library.add(b5);
			library.add(b6);
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
