import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the arrays : ");
        int n = sc.nextInt();

        float arr[] = new float[n];

        System.out.println("Enter " + n + " values in the array \n");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + " : ");
            arr[i] = sc.nextFloat();
        }
        float sum = 0;
        for (float num: arr) {
            sum += num;
        }
        float average = sum / n;

        System.out.println("\nThe sum of the elements is : " + sum);
        System.out.println("The average of the elements is : " + average);
        sc.close();
    }
    
}