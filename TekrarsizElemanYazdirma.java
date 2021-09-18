package YildizliSorular;

import java.util.Arrays;

public class TekrarsizElemanYazdirma {

	public static void main(String[] args) {
		
        //System.out.println(singleNumber(new int[]{2,2,1}));  // 1
        System.out.println(singleNumber(new int[]{4,1,2,1,2})); //4
        //System.out.println(singleNumber(new int[]{1})); //1
        
        System.out.println();
        
//        System.out.println(solution(new int[]{2,2,1}));  // 1
//        System.out.println(solution(new int[]{4,1,2,1,2})); //4
//        System.out.println(solution(new int[]{1})); //1

    }
    static int singleNumber(int[] array)
    {
        int result=0;

        for(int i=0;i<array.length;i++)
        {
        	System.out.println(result ^= array[i]); 
        }

        return result;
    }
    
static int solution(int[] numbers) {
		
		int distinctTotal = Arrays.stream(numbers).distinct().sum();
		int arrayTotal = Arrays.stream(numbers).sum();
		
		return 2 * distinctTotal - arrayTotal;
	}

	}


