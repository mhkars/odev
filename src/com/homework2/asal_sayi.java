package com.homework2;

import java.util.Scanner;

public class asal_sayi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("sayi girişi yapiniz : ");
		int a = sc.nextInt();
		int b = 2;
		String c = " sayı asal degil";

		boolean y = false;
		while (y == false && b < a) {
			if (a < 3) {
				c = "sayi asal degil";
				y = true;
			} else if (a % b == 0) {
				c = "sayi asal degil";
				y = true;
			} else {
				c = "sayi asal";
				b++;
			}

		}
		System.out.println(c);
	}
}
