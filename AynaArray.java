package YildizliSorular;

public class AynaArray {

	
		
		
		  public static void main(String[] args) {
		        // ayna check sorusu
		     
			  int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		        System.out.println(simetrik(arr1));
		    }
		   
		  public static boolean simetrik(int arr1[]) {
		      int sayac=0;
			  boolean result=false;
		       
		        for (int i = 0; i < arr1.length; i++) {
		         
		        	if (arr1[i] == arr1[arr1.length - 1 - i]) {
		                result = true;
		            } else {
		            	
		                result = false;
		                
		                break;
		                }
		        	
		        	
		        }
		        return result;

	}

}
