package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int j = 0 ; j<=num; j++) {
			for(int i = 1 ; i<=(num-j) ; i++) {
				System.out.print("*");
			}
		System.out.println("");
		}
		
		
		sc.close();
	}

}
