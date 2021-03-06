package YildizliSorular;
import java.util.Arrays;
import java.util.HashMap;

public class MapleHarf03 {

	// kullan?c?dan al?nan bir String'deki herbir karakterin adedini bir array
	// i?inde yazd?ran bir java program? yaz?n.
	// String "Javacilar cook afilli" ise cevap ??yle olmal?d?r:
	// { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}

	public static void main(String[] args) {

		String cumle = "Javacilar cook afilli";

		cumle = cumle.replaceAll("\\s", "");

		String arrKelime[] = cumle.split("");

		Arrays.sort(arrKelime);

		System.out.println(Arrays.toString(arrKelime));

		HashMap<String, Integer> harf = new HashMap<>();

		for (String w : arrKelime) {

			
			
			Integer value = harf.get(w);

			if (value == null) {

				harf.put(w, 1);

			} else {

				harf.put(w, value + 1);
			}
		}
		
		System.out.println(harf);

		System.out.println(harf.keySet());
	}

}
