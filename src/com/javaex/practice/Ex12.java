package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int ex = 1;
		
		for (int i = 1; i<=num; i++) {   //팩토리얼
			ex = ex*i;
		}
		
		System.out.println("결과값 : "+ex);
		
		sc.close();
	}

}
