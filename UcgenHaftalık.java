package YildizliSorular;


import java.util.Scanner;



public class UcgenHaftalýk {

	public static void main(String[] args) {

		
		
//      *
//     **
//    * *
//   *  *
//  *   *
// *    *
//*******
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir rakam giriniz: ");
		int sayý = scan.nextInt();

		String yýldýz = "";

		for (int i = 0; i < sayý; i++) { // aþaðýya doðru inme

			for (int j = i; j < sayý; j++) { // soldan boþluk býrakma

				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) { // ilk iki satýr ve son satýrda bosluk býrakýlmamasý için yazýldý

				if (i < 2) {

					System.out.print("*");
				} else if (i == (sayý - 1)) {
					System.out.print("*");
				}

			}
			System.out.print("*"); // 2. satýr sonrasý soldan býrakýlan bosluktan sonra konulan tek yýldýzlar

			for (int m = 0; m <= 1 + i; m++) { // konulan tek yýldýzlardan sonra kac bosluk býrakýlacaðý belirleniyor.

				if (m > 2) {

					System.out.print(" ");
				}

			}
			for (int n = 0; n <= 0; n++) { // 3. satýrdan itibaren býrakýlan bosluk sonrasý konulan tek yýldýzlar

				if (i > 1 && i < sayý - 1) {
					System.out.print("*");
				}
			}

			System.out.println(" ");

		}
	
	
	
	
	
	}

}
