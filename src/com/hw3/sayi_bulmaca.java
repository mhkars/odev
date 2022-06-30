package com.hw3;

import java.util.Random;
import java.util.Scanner;

public class sayi_bulmaca {

	public static void main(String[] args) {
		int life = 6;
		int turn = 0;

		System.out.println("*************");
		System.out.println("****MENU*****");
		System.out.println("*************");
		System.out.println("Can Sayisi :" + life);
		System.out.println("Tur Sayisi :" + turn);
		System.out.println("*************");
		System.out.println("1-Oyuna Basla");
		System.out.println("2-Cikis Yapin");
		Scanner sc = new Scanner(System.in);
		int secim = sc.nextInt();
		Random rd = new Random();
		int rastgele_sayi = rd.nextInt(100);
//		System.out.println(rastgele_sayi);

		switch (secim) {
		case 1:
			System.out.println("Bir tahmin yapiniz...:");
			while (life > 0) {
				int tahmin = sc.nextInt();
				int fark = tahmin - rastgele_sayi;
				turn++;
				life--;

				if (tahmin == rastgele_sayi) {
					System.out.println(
							"Tebrikler tahmininiz " + tahmin + " dogru sayi,\n" + turn + ". denemede bildiniz");
				} else if (fark < 11 && fark > 0) {
					System.out.println("Yaklastiniz. Tahmininizi azaltiniz.");

				} else if (fark > -11 && fark < 0) {
					System.out.println("Yaklastiniz. Tahmininizi arttiriniz. ");

				} else if (tahmin > rastgele_sayi) {
					System.out.println("Uzaksiniz. Azaltin.");
				} else {
					System.out.println("Uzaksiniz. Arttirin.");
				}

				System.out.println("Kalan Can Sayisi " + life);
			}
			System.out.println("*****Kaybettiniz*****\nTekrar oynamak ister misiniz?");
			break;
		case 2:
			break;
		}
	}

}

//Ödev- Sayı bulmaca oyunu programı
//6 hakkınız vardır
//Her tahminde 1 hakkınızı kaybedersiniz
//Eğer hakkınız bitmişse kaybettiniz uyarısını ekrana yazdırın ve tekrar oynamak isteyip istemediğini sorunuz
//
//Menümüz olsun
//Hak Sayısı yazsın
//Ve kaçıncı kez oynadığımız yazsın
//Ve iki seçenek olsun
//1-oyuna başla
//2-sistemden çıkış
//Her tahmin sonrası ekrana neler yazdırılabilir:
//Kaç hakkınızın kaldığı
//Eğer tutulan sayı ile tahmin ettiğiniz sayı arasındaki fark 10 ise yaklaştınız arttırın yada azaltın ,
//Eğer 10 dan fazla ise uzaksınız arttırın veya azaltın
//Eğer tahmin doğru ise kaçıncı tahminde bildiğimizi ve sayı yı ekrana yazdırın