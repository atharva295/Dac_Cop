package com.acts.bookstore;

import java.util.HashSet;

import java.util.Set;

public class BookDataSetUtils {
	public static Set<Books> getBookSet() {
		Set<Books> bookhashset = new HashSet<>();
		
		BookType type1 = BookType.valueOf("ALGEBRA");
		BookType type2 = BookType.valueOf("MOTIONS");
		BookType type3 = BookType.valueOf("ORGANIC");
		BookType type4 = BookType.valueOf("PLANTS");
		BookType type5 = BookType.valueOf("DRAWING");
		Books b1 = new Books("Maths", type1, 120, "2003-04-01", "Sandeep Pawar", 100);
		Books b2 = new Books("Physics", type2, 145, "2004-05-02", "Sandeep Pawar", 200);
		Books b3 = new Books("Chemistry", type3, 170, "2005-06-03", "Sandeep Pawar", 300);
		Books b4 = new Books("Biology", type4, 195, "2006-07-04", "Sandeep Pawar", 121);
		Books b5 = new Books("Arts", type5, 230, "2007-08-05", "Sandeep Pawar", 456);
		bookhashset.add(b1);
		bookhashset.add(b2);
		bookhashset.add(b3);
		bookhashset.add(b4);
		bookhashset.add(b5);

		return bookhashset;

	}

}
