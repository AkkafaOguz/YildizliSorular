package YildizliSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HarfAdedi {

	public static void main(String[] args) {
		
		
		// kullanýcýdan alýnan bir  String'deki herbir  karakterin adedini bir array içinde yazdýran bir java programý yazýn.         
		// String  "Javacilar cook afilli" ise cevap þöyle olmalýdýr:        
		// { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
		
		
		String str = "Javacilar cook afilli";
        String[] strList = str.split("");
        Arrays.sort(strList);
        System.out.println(Arrays.toString(strList));
        int sayac = 1;
        List<String> strListArrays = new ArrayList<>();
        List<String> strListArraysHarfler = new ArrayList<>();
       
        for (int i = 0; i < str.length(); i++) {
            sayac = 1;
           
            for (int j = i + 1; j < str.length(); j++) {
               
            	if (strList[i].equals(strList[j])) {
                    
            		sayac++;
                    
            		
                    
                }
            }
          
            if (sayac > 1 && !strListArrays.contains(strList[i])) {
                strListArrays.add(strList[i]);
                strListArraysHarfler.add(strList[i]+ "= " + sayac);
          
            } else if (sayac==1 && !strListArrays.contains(strList[i]) ) {
                
                strListArrays.add(strList[i]);
                strListArraysHarfler.add(strList[i]+ "= " + sayac);
                
            }
        }
       
        System.out.println(strListArrays);
        System.out.println(strListArraysHarfler);
        
		
	
	}
	
	
}
