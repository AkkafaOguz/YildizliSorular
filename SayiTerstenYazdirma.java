package YildizliSorular;

import java.util.Scanner;

public class SayiTerstenYazdirma {

	public static void main(String[] args) {
	
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz: ");
		int sayi= scan.nextInt();
		
		//ilk yol
		
		for (int i = sayi; i > 0 ;                  i/=10) {
			
			System.out.print(i%10);
			
			
		}
		
		
		//ikinci yol
		
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append(sayi);
		System.out.println();
		
		
		System.out.print(sb1.reverse());
		

	}

}
