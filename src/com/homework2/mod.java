package com.homework2;

import java.util.Scanner;

public class mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Sayi giriniz...: ");
		int a = sc.nextInt();
		System.out.println("mod almak istediğiniz sayiyi giriniz ...:");
		int b = sc.nextInt();

		int c = a % b;
		System.out.println(a + " % " + b + " = " + c);
	}

}
