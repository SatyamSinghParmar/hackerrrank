package org.learn.hackerrank;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x1=scan.nextInt();
		int v1=scan.nextInt();
		int x2=scan.nextInt();
		int v2=scan.nextInt();
		
		if((x2>x1)&&(v2>v1))
		{
			System.out.println("NO");
		}

		
		else
		{
			while(x2>x1)
				x1=x1+v1;
			x2=x2+v2;
			
			if(x2==x1)
			{
				System.out.println("YES");
			}
	}
	}

}
