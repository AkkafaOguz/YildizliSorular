package YildizliSorular;

public class Palidrome {

	public static void main(String[] args) {
		
		
		/*Bir c�mleyi parametre olarak kabul eden, StringBuilder kullanarak c�mleyi ters �eviren ve c�mlenin palindrom
	       olup olmad���n� kontrol eden (b�y�k/k���k harf duyarl�l��� olmadan) bir Java program� yaz�n.
	    (without case sensitivity)
	    Eg : input : I love Java
	    Output: "Reversed sentence : avaJ evol I .
	       It is not a palindrome"
		*/

		
		String str= "tras neden sart";
		
		StringBuilder sb1 = new StringBuilder ("tras neden sart");
		
		System.out.println(sb1);
		
		sb1.reverse();
		
		System.out.println("Reserved sentence: " + sb1);
		
		if (str.equals(sb1.toString())) {
			
			System.out.println("It  palindrome");
		} else {
			
			System.out.println("It is not a palindrome");
		}

			
			
		
		
		
	}

}
