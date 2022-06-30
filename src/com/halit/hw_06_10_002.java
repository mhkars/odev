package com.halit;

import java.util.Scanner;

public class hw_06_10_002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Kenar sayisini giriniz :");
		double n = sc.nextInt();
		System.out.println("Kenar uzunluğunu giriniz : ");
		double s = sc.nextInt();
		double a = (n * s * s) / (4 * Math.tan(3.14 / n));
		System.out.println("Cokgenin alanı :" + a);

	}

}
