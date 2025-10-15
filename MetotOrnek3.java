package Metotlar;

import java.util.Scanner;

public class MetotOrnek3 {

	public static void main(String[] args) {
		Scanner tara = new Scanner(System.in);
		// Metotlar ile televizyon
		while(true) {
		menuGoster();
		int secim = tara.nextInt();
		if (secim == 1) {
			System.out.println("Tv açılıyor...");
			kanalMenusu();
		} 

		}
		int kanalSecimi = tara.nextInt();
		if (kanalSecimi == 1) {
			diziKanallari();
		} else if (kanalSecimi == 2) {
			filmKanallari();
		} else if (kanalSecimi == 3) {
			muzikKanallari();
		} else if (kanalSecimi == 4) {
			radyoKanallari();}
			else if(kanalSecimi==0) {
				System.out.println("Tv kapatılıyor...");
				break;
			}
		else {
			System.out.println("Aradığınız kanal bulunamadı...");
		}
	}
	}
	public static void menuGoster() {

		System.out.println("Vestele Hoşgeldiniz.");
		System.out.println("Uyku modu..");
		System.out.println("Televizyonu açmak için 1'i tuşlayın.");

	}

	public static void kanalMenusu() {
		System.out.println("1 - Dizi kanalları		***");
		System.out.println("2 - Film kanalları		***");
		System.out.println("3 - Müzik kanalları		***");
		System.out.println("4 - Radyo kanalları		***");
		System.out.println("0 - Tv'yi kapatmak için");

	}

	public static void diziKanallari() {
		System.out.println("1 - Atv");
		System.out.println("2 - Now TV");
		System.out.println("3 - Show TV");
		System.out.println("4 - Kanal D TV");
		System.out.println("0 - Tv'yi kapatmak için ");
	}

	public static void filmKanallari() {
		System.out.println("1 - Bein Movies 1");
		System.out.println("2 - Bein Movies 2");
		System.out.println("3 - Netflix ");
		System.out.println("4 - Blue TV");
		System.out.println("0 - Tv'yi kapatmak için ");
	}

	public static void muzikKanallari() {
		System.out.println("1 - Number 1 ");
		System.out.println("2 - Power Türk");
		System.out.println("3 - Kral Pop ");
		System.out.println("4 - Trt Müzik");
		System.out.println("0 - Tv'yi kapatmak için ");
	}

	public static void radyoKanallari() {
		System.out.println("1 - Number 1 Fm ");
		System.out.println("2 - Power Türk Fm");
		System.out.println("3 - Kral Pop Fm");
		System.out.println("4 - Trt Müzik Fm");
		System.out.println("0 - Tv'yi kapatmak için");
	}
}