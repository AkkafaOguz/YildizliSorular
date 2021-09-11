package YildizliSorular;

import java.util.Scanner;

public class ArmstrongSayi {

	public static void main(String[] args) {
		
		
	    // Kullanicidan alinan bir sayinin Armstrong sayi olup olmadigini kontrol eden program yazin
		// Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
		// 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayi giriniz: ");
		int sayi = scan.nextInt();

		int toplam = 0;

		
		//153
		for (int i = sayi; i > 0;   i /= 10) {

			int a = i % 10;

			toplam += a * a * a;

		}
		


		if (toplam == sayi) {

			System.out.println("Bu bir armstrong sayidir.");
		} else {
			System.out.println("Bu bir armstrong sayi degildir.");
		}

	}

}
