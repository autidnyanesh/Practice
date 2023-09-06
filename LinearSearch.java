import java.util.Scanner;

public class LinearSearch {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] arr = new int[size];
            System.out.println("Enter the elements in the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.print("Enter the value of which you want to search: ");
            int n = scanner.nextInt();
            for(int i=0;i<arr.length;i++){
                if(arr[i] == n){
                    System.out.print(arr[i]);
                }
            }
        }
}
