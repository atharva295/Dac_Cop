import java.util.*;
public class Prime100{
	public static void main(String... args){
		int flag=0 ;
		for(int i=2;i<=100;i++){
			int temp =i/2 ;
			for (int j=2;j<=temp;j++){
				if(i%j==0){
					flag=1 ;
					break ;
				}
			}
			if(flag==0)
			System.out.print(" "+i);
			flag =0;
			
		}
		


	}
}
