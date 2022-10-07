package Exception2;

import java.util.Scanner;

public class VehicleTester {
	Scanner sc = new Scanner(System.in) ;
	public static void main(String[] args) {
		Vehicle v= new Vehicle() ;
		int s = 90 ;
		v.checkSpeed(s) ;
	}
}
