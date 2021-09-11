package YildizliSorular;

import java.util.Arrays;
import java.util.HashMap;

public class MapMulakatSorusu {

	public static void main(String[] args) {
		
		String str = "Java is easy. Type codes to learn Java. To earn money learn Java.";
		System.out.println(str);
		
		str = str.replaceAll("\\p{Punct}", "");   // "\\p{Punct}" removes all dot from a string.
		System.out.println(str);
		
		String arr [] = str.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		HashMap <String, Integer> hp = new HashMap<>();
		
		for (String w : arr) {
			
			 
			if (hp.containsKey(w)) {
				
			
				
				hp.put(w, hp.get(w)+1);
				
			} else {
				
				hp.put(w, 1);
			}
		
		}

		System.out.println(hp);
	}

}
