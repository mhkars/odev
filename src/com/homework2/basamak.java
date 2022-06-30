package com.homework2;
import java.util.Scanner;

public class basamak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayi giriniz..:");
		int a = sc.nextInt();
		int b;
		int i = 1;

		do {
			b = a / i;
			i = i * 10;

		} while (b > 10);
		System.out.println((i / 10) + "'ler basamagi : " + ((a * 10) / i));

	}

}
