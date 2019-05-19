package org.learn.hackerrank;

import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int length=scan.nextInt();
		int sum=0;
		for(int i=0;i<length;i++)
		{
			sum=sum+scan.nextInt();
		}
		
 System.out.println(sum);
	}

}
