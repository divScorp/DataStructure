package array;
/*
 *  To take input in array and display
 *  @author Div (Vidhikara)
*/

import java.util.Scanner;
public class array{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("How many elements? ");
        int n=Integer.parseInt(sc.nextLine());//takes how many integer will be there.
        String[] array = new String[n];//Array declaration 
            
        System.out.println("Enter the numbers: ");
        //Input the array elements a/c to size of array
        for(int i=0; i<array.length; i++){           
            array[i]= sc.nextLine();
        }
        
        System.out.print("Your Numbers are: \n");
        //Display elements of array.3
        for (int j=0; j<array.length; j++) {            
            System.out.println("Your "+ (j+1) +" numbers: ");
            System.out.print(array[j]+"\n");
        }
        sc.close();
    }
}