package org.learn.hackerrank;

import java.util.Scanner;

public class MinMaxSum1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//int length=scan.nextInt();
		long[] array=new long[5];
		long sum=0;
		for(int i=0;i<5;i++)
		{
			array[i]=scan.nextInt();
			
			sum=sum+array[i];
			
		}
		long min=array[0],max=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
			if(max<array[i])
			{
				max=array[i];
			}
		}
		
		System.out.println(sum-max);
		System.out.println(" ");
		System.out.println(sum-min);
		
		
		
	}

}
