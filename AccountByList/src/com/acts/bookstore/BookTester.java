package com.acts.bookstore;

import java.util.Set;

public class BookTester {

	public static void main(String[] args) {
		Set<Books> bookHashSet = BookDataSetUtils.getBookSet();
		System.out.println(bookHashSet);

	}

}
