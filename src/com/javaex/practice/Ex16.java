package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
	public static void mian(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		for(int i = 1; i<num; i++) {
			if(i%5==0) {
				
				sum = sum+i;
				count++;
			} else{
				//아무것도 안 함
			}
		}
		
		System.out.println("5의배수의 갯수: "+count);
		System.out.println("5의배수의 합: "+sum);
		
	}

}
