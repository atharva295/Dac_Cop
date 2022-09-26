import java.util.* ;
public class Swap{
	public static void main(String... args){
		Scanner sc =new Scanner(System.in) ;
		System.out.println("Enter First no:");
		int a = sc.nextInt();
		System.out.println("Enter Second no:");
		int b = sc.nextInt();
		
		/*a=a+b ;
		b=a-b ;
		a= a-b ;*/
		List ls = new ArrayList();
		 ls.add(a); 
		 ls.add(b);
		
		Swap(ls,a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
	}
}