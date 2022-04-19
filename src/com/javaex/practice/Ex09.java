package com.javaex.practice;

public class Ex09 {
	
	public static void main(String[]args) {
		
		for(int i=1; i<=10; i++) {
			int lim = i+10;
			for(int j=i; j<=lim; j++) {
				System.out.print(j+"\t");
			}
			System.out.println("");
		}
	}

}
