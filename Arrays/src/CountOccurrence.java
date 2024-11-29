import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to find its occurrence : ");
        int occur = sc.nextInt();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == occur) {
                count++;
            }
        }
        System.out.println("\nThe number of times " + occur + " appears in the array is : " + count);
        sc.close();
    }
}