package YildizliSorular;


import java.util.Scanner;



public class UcgenHaftal�k {

	public static void main(String[] args) {

		
		
//      *
//     **
//    * *
//   *  *
//  *   *
// *    *
//*******
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir rakam giriniz: ");
		int say� = scan.nextInt();

		String y�ld�z = "";

		for (int i = 0; i < say�; i++) { // a�a��ya do�ru inme

			for (int j = i; j < say�; j++) { // soldan bo�luk b�rakma

				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) { // ilk iki sat�r ve son sat�rda bosluk b�rak�lmamas� i�in yaz�ld�

				if (i < 2) {

					System.out.print("*");
				} else if (i == (say� - 1)) {
					System.out.print("*");
				}

			}
			System.out.print("*"); // 2. sat�r sonras� soldan b�rak�lan bosluktan sonra konulan tek y�ld�zlar

			for (int m = 0; m <= 1 + i; m++) { // konulan tek y�ld�zlardan sonra kac bosluk b�rak�laca�� belirleniyor.

				if (m > 2) {

					System.out.print(" ");
				}

			}
			for (int n = 0; n <= 0; n++) { // 3. sat�rdan itibaren b�rak�lan bosluk sonras� konulan tek y�ld�zlar

				if (i > 1 && i < say� - 1) {
					System.out.print("*");
				}
			}

			System.out.println(" ");

		}
	
	
	
	
	
	}

}
