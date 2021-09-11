package YildizliSorular;

import java.util.Arrays;

public class Q08 {

	public static void main(String[] args) {

		/*
		 * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
		 * 
		 * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
		 */

		String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

		String arr[] = str.split(" ");

		String dolar = "";
		String euro = "";

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].contains(Character.toString('$'))) {

				dolar += arr[i] + " ";
			} else {

				euro += arr[i] + " ";
			}

		}

		String yeniDolar = dolar.replace("$", "");
		String yeniEuro = euro.replace("£", "");

		String arrDolar[] = yeniDolar.split(" ");
		String arrEuro[] = yeniEuro.split(" ");

		int yeniDolarInt = 0;
		int yeniEuroInt = 0;

		String yeniDolarStr = "";
		String yeniEuroStr = "";

		for (int i = 0; i < arrDolar.length; i++) {

			yeniDolarStr = arrDolar[i];

			yeniDolarInt += Integer.parseInt(yeniDolarStr);

		}

		for (int i = 0; i < arrEuro.length; i++) {

			yeniEuroStr = arrEuro[i];

			yeniEuroInt += Integer.parseInt(yeniEuroStr);

		}

		System.out.println("Euro isaretli sayilarin toplami: " + yeniEuroInt);
		System.out.println("Dolar isaretli sayilarin toplami: " + yeniDolarInt);
	}

}
