package YildizliSorular;

import java.util.Scanner;

public class ArtikYýlNested {

	public static void main(String[] args) {
	
		/*
		 * Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini
		 * isteyin. 
		 * Kural 1: 4 ile bolunemeyen yillar artik yil degildir 
		 * Kural 2: 4 ile
		 * bolunup 100 ile bolunemeyen yillar artik yildir 
		 * Kural 3: 4’un kati olmasina
		 * ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik
		 * yildir
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir yýl giriniz: ");
		int yil = scan.nextInt();
	
	
	    if (yil%4 != 0) {
	    	System.out.println("Girilen yýl artýl yýl deðil.");
	    
	    
	   }else { //4'E bölünenler
		   
	   
		   if (yil%100 == 0 && yil%400==0) {
		   System.out.println("Artik yýl");
	   
		  }else if (yil%100== 0 && yil%400 !=0) {
			  System.out.println("Girilen yýl artýl yýl deðil.");
		  }else {
			  System.out.println("Artik yýl");
		  }
	   }
	
	
	
	
	}

}
