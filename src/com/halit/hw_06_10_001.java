package com.halit;

import java.util.Scanner;

public class hw_06_10_001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Baslangic hizini giriniz : ");
		double v = sc.nextInt();
		System.out.println("Firlatma acisini giriniz : ");
		double s = sc.nextInt();
		double h = Math.round(((v * v) / (2 * 9.81)) * (Math.sin((s * 3.14) / 180) * Math.sin((s * 3.14) / 180)) * 100);
		System.out.println("Yukseklik :" + h / 100);
		double w = Math.round(((v * v) / (2 * 9.81)) * (2 * Math.sin(2 * s)) * 100);
		System.out.println("Mesafe :" + w / 100);
	}

}
