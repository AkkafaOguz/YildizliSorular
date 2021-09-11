package YildizliSorular;



public class TekrarEdenKarakterler {

	public static void main(String[] args) {
		
		
		/*
		 * Bir String icerisinde yinelenen karakterleri döndüren bir kod
		 * yazýniz.(mülakat Sorusu)
		 * 
		 * Input :
		 * 
		 * String str=“Javaisalsoeasy”
		 * 
		 * Output: a s
		 */
	
		String strKontrol = "";

		String str = "Javaisalsoeasy";

		for (int i = 0; i < str.length(); i++) {

			if (!(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))) {

				if (!strKontrol.contains(Character.toString(str.charAt(i)))) {

					strKontrol += str.charAt(i);

				}
			}

		}

		System.out.println(strKontrol);
		
	}

}
