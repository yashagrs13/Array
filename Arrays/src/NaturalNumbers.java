import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("First 10 Natural numbers are : ");
        for (int i = 0 ; i<arr.length ; i++)
        {   
            System.out.print(arr[i] +" ");
        }      
        sc.close();
    }
}
