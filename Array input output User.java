

package Array_Pack;

import java.util.Scanner;

public class passway {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        

        int ArrSize= input.nextInt();
        
 int[] arr = new int[ArrSize]    ;    
        for(int i=0; i<ArrSize; i++){
            arr[i] = input.nextInt();
        }
        
        
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
        
    }
}



