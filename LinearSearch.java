import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Enter " + length + " array elements:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to search for: ");
        int target = scanner.nextInt();
        
        for (int i = 0; i < length; i++) {
            if (array[i] == target) {
                System.out.println("Element " + target + " found at index " + i);
            }
        }

        scanner.close();
    }
}
