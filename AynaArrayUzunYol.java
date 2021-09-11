package YildizliSorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AynaArrayUzunYol {

	public static void main(String[] args) {


	
		Scanner scan = new Scanner(System.in);

		System.out.println(
				"Lutfen kac adet tamsayi gireceginizi yaziniz: \nUnutmayin, ayna array icin eleman uzunlugunuz cift sayi olmali!");
		int arrlength = scan.nextInt();

		int arr[] = new int[arrlength];

		for (int i = 0; i < arrlength; i++) {

			System.out.println("Lutfen " + i + ". index icin eleman giriniz.");
			arr[i] = scan.nextInt();
		}

		List<Integer> aynaArr = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			aynaArr.add(arr[i]);

		}

		System.out.println(aynaArr);

		List<Integer> aynaArrIlkKisim = new ArrayList<>();
		List<Integer> aynaArrIkinciKisim = new ArrayList<>();

		if (arr.length % 2 == 0) {

			for (int i = 0; i < aynaArr.size() / 2; i++) {

				aynaArrIlkKisim.add(aynaArr.get(i));

			}

			for (int i = aynaArr.size() - 1; i >= aynaArr.size() / 2; i--) {

				aynaArrIkinciKisim.add(aynaArr.get(i));
			}

			System.out.println(aynaArrIlkKisim);
			System.out.println(aynaArrIkinciKisim);

			if (aynaArrIlkKisim.equals(aynaArrIkinciKisim)) {

				System.out.println("Bu bir ayna arraydir.");
			} else {

				System.out.println("Ayna array degildir.");
			}

		} else {
			System.out.println("Ayna array degildir.");
		}
	        
	        
	        

	}

}
