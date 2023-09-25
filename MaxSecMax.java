package com.extra;

public class MaxSecMax {
	public static void main()
	{
		int[] a= {5,78,45,1,87};
		int max=a[0];
		int Second_Max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max)
			{
				max=a[i];
			}

		}
		Second_Max=max;
		for(int i=0;1<a.length;i++)
		{
			if(Second_Max>a[i]&& Second_Max<=max)
			{

				Second_Max=a[i];}
		}

		System.out.println(max);
		System.out.println(Second_Max);

	}
}
