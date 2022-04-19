package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int k=1; k<=num; k++) { // *갯수가 점점 줄어들기
			for(int l=1; l<=num-k+1; l++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		for(int i=1; i<=num; i++) { // *갯수가 점점 많아지기
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
			
		}
		
		sc.close();
	}

}
