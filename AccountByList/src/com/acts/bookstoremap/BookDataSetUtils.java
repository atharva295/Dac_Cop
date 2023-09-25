package com.acts.bookstoremap;

import java.util.HashMap;
import java.util.Map;

public class BookDataSetUtils {
	public static Map<Integer,Books> getBookMap() {
		HashMap<Integer,Books> bookhashMap = new HashMap<Integer,Books>();
		
		BookType type1 = BookType.valueOf("ALGEBRA");
		BookType type2 = BookType.valueOf("MOTIONS");
		BookType type3 = BookType.valueOf("ORGANIC");
		BookType type4 = BookType.valueOf("PLANTS");
		BookType type5 = BookType.valueOf("DRAWING");
		Books b1 = new Books(1001,"Maths", type1, 120, "2003-04-01", "Sandeep Pawar", 100);
		Books b2 = new Books(1002,"Physics", type2, 145, "2004-05-02", "Rishabh Kanathe", 100);
		Books b3 = new Books(1003,"Chemistry", type3, 170, "2005-06-03", "Gaurav Kumar", 100);
		Books b4 = new Books(1004,"Biology", type4, 195, "2006-07-04", "Abhijeet Tambe", 100);
		Books b5 = new Books(1005,"Arts", type5, 230, "2007-08-05", "Ajay Khade", 100);
		bookhashMap.put(b1.getUniqueId(),b1);
		bookhashMap.put(b2.getUniqueId(),b2);
		bookhashMap.put(b3.getUniqueId(),b3);
		bookhashMap.put(b4.getUniqueId(),b4);
		bookhashMap.put(b5.getUniqueId(),b5);

		return bookhashMap;

	}

}
