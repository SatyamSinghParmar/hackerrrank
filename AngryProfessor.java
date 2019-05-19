package org.learn.hackerrank;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		int n=scan.nextInt();
		int k=scan.nextInt();
		int count=0;
		int []array=new int [n];
		for(int i=0;i<array.length;i++)
		{
			array[i]=scan.nextInt();
			if(array[i]<=0)
			{
			 	count++;
			}
		}
		if(count>=k)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
		
		

	}

}
