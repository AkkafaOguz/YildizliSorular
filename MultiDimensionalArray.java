package YildizliSorular;

import java.util.Iterator;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
		// elemanlarin toplamini ekrana yazdiran bir program yaziniz.
		// arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

		int arr1[][] = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
		int arr2[][] = { { 7, 8, 9 }, { 10, 11 }, { 12 } };

		// 1.yol

		int toplam = 0;

		for (int i = 0; i < arr1.length; i++) { // i burada ikisi icin de ayni olmasi gerek

			for (int j = 0; j < arr1[i].length; j++) { // ilk arrayin inner arrayleri

				for (int k = 0; k < arr2[i].length; k++) { // ikinci arrayin inner arrayleri

					if (k == j) {

						toplam += arr1[i][j] + arr2[i][k];

						int tempToplam = arr1[i][j] + arr2[i][k]; // ekstra sov yapmak icin

						System.out.println(arr1[i][j] + "+" + arr2[i][k] + "= " + tempToplam);
					}

				}

			}

		}

		System.out.println(toplam);

		
		
		
		// 2.yol
		
		
		//int arr1[][] = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
		//int arr2[][] = { { 7, 8, 9 }, { 10, 11 }, { 12 } };

		int ikinciYolToplami = 0;

		int length = arr1.length < arr2.length ? arr1.length : arr2.length;

		for (int i = 0; i < length; i++) {

			int innerLength = arr1[i].length < arr2[i].length ? arr1[i].length : arr2[i].length;

			for (int j = 0; j < innerLength; j++) {

				ikinciYolToplami += arr1[i][j] + arr2[i][j];

				int tempIkinciYolToplami = arr1[i][j] + arr2[i][j];

				System.out.println(arr1[i][j] + "+" + arr2[i][j] + "= " + tempIkinciYolToplami);
			}

		}

		System.out.println(ikinciYolToplami);
	}

}
