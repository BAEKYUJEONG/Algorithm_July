package com.java.first;

import java.util.Scanner;

public class Compute {
	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� ���� �Է� : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.println("��="+num1*num2);
		System.out.println("��="+num1/num2);
	}

}
