package YildizliSorular;
import java.util.Arrays;

public class DigitSoru {

	public static void main(String[] args) {
		
		String str= "ade1r4d3";
        int sum=0;
        
        String arr[]= str.split("");
        System.out.println(Arrays.toString(arr));
        
        for (String w : arr) {
            
            if(Character.isDigit(Integer.valueOf(w.charAt(0)))) {
//          if (Character.isDigit(each.charAt(0))) ==> Bu sekilde de calisiyor.
            
            
            	sum+=Integer.valueOf(w);
            } else {
                continue;
            }
        }
        System.out.println(sum);
	}

}
