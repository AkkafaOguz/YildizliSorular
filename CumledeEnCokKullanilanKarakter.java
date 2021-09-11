package YildizliSorular;

import java.util.Arrays;
import java.util.Scanner;

public class CumledeEnCokKullanilanKarakter {

	public static void main(String[] args) {

		// Kullanicidan bir cumle aliniz ve bu cümlede en cok kullanilan karakteri
		// yazdiriniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz: ");
		String cumle = scan.nextLine();

		cumle = cumle.replace(" ", "");

		String cumleHarf[] = cumle.split("");

		Arrays.sort(cumleHarf);

		int sayac = 1;
		int oncekiHarfinSayisi = 1;

		String enCokTekrarEdenHarf = "";

		for (int i = 0; i < cumleHarf.length - 1; i++) {

			if (cumleHarf[i].equals(cumleHarf[i + 1])) {

				sayac++;

				if (sayac > oncekiHarfinSayisi) {

					oncekiHarfinSayisi = sayac;

					enCokTekrarEdenHarf = cumleHarf[i];

				}

			} else {

				sayac = 1;
			}

		}

		if (enCokTekrarEdenHarf.isEmpty()) {

			System.out.println("Tekrarlanan karakter yok!");
		} else {

			System.out.println("Girginiz cumlede en cok tekrar eden karakter : " + enCokTekrarEdenHarf);

		}

	}

}
