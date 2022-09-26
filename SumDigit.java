import java.util.* ;
public class SumDigit{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum ;
		
		Summ s = new Summ();
		sum = s.getsum(n);
		
		
		System.out.println("Sum of Digits of number "+n+" is "+sum);
	}
	
}
class Summ{
	int getsum(int n ){
		int temp =n ;//n=1234
		int sum =0 ;
		while(temp!=0){
			sum =sum+temp%10 ;
			temp = temp/10;
		}
			return sum ;
	}
}