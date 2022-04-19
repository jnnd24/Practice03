package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		for(i=1; i<=num; i++) {

			for(int j=1; j<=i; )	{
				System.out.print(i);
			}
			System.out.println("");
		}
		
		
	}

}
