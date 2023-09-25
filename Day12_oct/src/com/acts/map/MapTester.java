package com.acts.map;
import java.util.*;

public class MapTester {
	public static void main(String... args ) {
		int choice=0;
		Map<String, List<String>> Country = new HashMap<>() ;
		Scanner sc= new Scanner(System.in) ;
		do {
			System.out.println("1. Enter data \n2. Show states within given country \n3. Show all Countries with states ");
			choice =sc.nextInt() ;
			switch(choice) {
			case 1 :{
				List<String> s =new ArrayList<String>();
				System.out.println("Enter Country name"); 
				String c =sc.next() ;
				System.out.println("Enter number of states"); 
				int n = sc.nextInt() ;
				for(int i=0;i<n ;i++) {
					System.out.println("Enter state name");
					s.add(sc.next()) ; 
				}
				Country.put(c, s);
			}break ;
			case 2 :{
				System.out.println("Enter Country name whose name you want to find");
				String s=sc.next() ;
				Set<String> c = Country.keySet() ;
				for(String i : c) {
					if(i.equalsIgnoreCase(s)) {
						List<String> k = Country.get(i) ;
						for(int j=0 ;j<k.size(); j++) {
							System.out.println(k.get(j));
						}
					}
				}
			}break ;
			case 3 :{
				Set<String> c = Country.keySet() ;
				for(String i : c) {
						List<String> k = Country.get(i) ;
						for(int j=0 ;j<k.size(); j++) {
							System.out.println(k.get(j));
						}
				}
			}break ;
			}
			
		}while(choice!=0);
	}
}
