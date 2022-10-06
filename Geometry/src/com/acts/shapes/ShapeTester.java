package com.acts.shapes;

import java.util.Scanner;

public class ShapeTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice =0 ;
		
			System.out.println("What you  want to create");
			System.out.println("1.Square");
			System.out.println("2.Circle ");
			System.out.println("3. Rectangle ");
			System.out.println("4.calculate Area and Perimeter of Square ");
			System.out.println("5.calculate Area and Circumference of circle");
			System.out.println("6.calculate Area and Perimeter of rectangle");
			System.out.println("0. Exit");
			
						choice = sc.nextInt() ;
			switch(choice){
			case 1:{
				System.out.println("enter the sides of square  ");
				Square a = new Square(sc.nextInt());
			}break;
			case 2:{
				System.out.println("enter the radius of circle  ");
				circle a = new circle(sc.nextInt());
			}break;
			case 3:{
				System.out.println("enter the length and breadth of rectangle  ");
				rectangle b = new rectangle(sc.nextInt(),sc.nextInt());
				 
				
			}break;
			
			case 4:{
				System.out.println("enter the side of square  ");
				Square a = new Square(sc.nextInt());
				System.out.println(a.calArea());
				System.out.println(a.calPeri());
				
			}break;
			case 5:{
				System.out.println("enter the radius of circle  ");
				circle a = new circle(sc.nextInt());
				System.out.println(a.calArea());
				System.out.println(a.calPeri()); 
				
			}break;
			case 6:{
				System.out.println("enter thelength and breadth of rectangle ");
				rectangle a = new rectangle(sc.nextInt(), sc.nextInt() );
				System.out.println(a.calArea());
				System.out.println(a.calPeri());
			}break;
			
			case 0 :{
				System.exit(0);
			}
			}
	}
}
