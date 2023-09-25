package com.acts.bookstoremap;

import java.util.Map;
import java.util.Scanner;

public class BookTester {

	public static void main(String[] args) {
		Map<Integer, Books> BookstoreMap = BookDataSetUtils.getBookMap();
		Scanner scan = new Scanner(System.in);

		int choice = 0;
		do {
			System.out.println("****Library Application****");
			System.out.println("1 Add book");
			System.out.println("2 Display All books");
			System.out.println("3 Allot book to student ( quantity -1)");
			System.out.println("4 Take book return ( quantity +1)");
			System.out.println("5 Remove book");

			choice = scan.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter the unique id of book");
			Integer id = scan.nextInt();
			System.out.println("Enter the title of book");
			String title = scan.next();
			System.out.println("Enter the bookType of book");
			BookType bookType = BookType.valueOf(scan.next());
			System.out.println("Enter the price of book");
			Integer price = scan.nextInt();
			System.out.println("Enter the publishedDate of book");
			String publishingdate = scan.next();
			System.out.println("Enter the authorName of book");
			String authorname = scan.next();
			System.out.println("Enter the Quantity of Books you want to add");
			int qty =scan.nextInt();
//Integer uniqueId,String title, BookType bookType, int price, String publishedDate, String authorName,int quantity
			Books book = new Books(id,title,bookType,price,publishingdate,authorname,qty);
			BookstoreMap.put(id, book);
			break;
			case 2:
				for (Map.Entry<Integer, Books> entry : BookstoreMap.entrySet()) {
					
					System.out.println(entry);
				}
				break;

			case 3:
				System.out.println("Enter the Books Unique ID");
				Integer uniqueid = scan.nextInt();

				System.out.println("Enter the Students Name");
				String studentName = scan.next();

				System.out.println(BookstoreMap.get(uniqueid).getTitle());
				System.out.println(BookstoreMap.get(uniqueid).getBookType());
				BookstoreMap.get(uniqueid).setQuantity(BookstoreMap.get(uniqueid).getQuantity() - 1);
				System.out.println("Printing allotment Details :");
				System.out.println("Name : " + studentName);
				System.out.println("Book Title : " + BookstoreMap.get(uniqueid).getTitle());
				System.out.println("Book Type : " + BookstoreMap.get(uniqueid).getBookType());
				System.out.println("Remaining quantity : " + BookstoreMap.get(uniqueid).getQuantity());
				System.out.println();
				break;

			case 4:
				System.out.println("Take book return");
				System.out.println("Enter the Books Unique ID");
				Integer uniqueid1 = scan.nextInt();
				BookstoreMap.get(uniqueid1).setQuantity(BookstoreMap.get(uniqueid1).getQuantity() + 1);
				System.out.println("Updated quantity : " + BookstoreMap.get(uniqueid1).getQuantity());
				break;

			case 5:
				System.out.println("Enter the UniqueId of the book you want to remove");
				Integer remove = scan.nextInt();
				// Books book = BookstoreMap.get(remove).

				BookstoreMap.remove(remove);
//				for(Integer s:BookstoreMap.keySet()) {
//				System.out.println(s);
//				}
				break;

			}
		} while (choice != 0);
		scan.close();
	}

}
