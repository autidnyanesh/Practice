import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter a value: ");
            int value = scanner.nextInt();
            arrayList.add(value);
        }
        System.out.println("Original ArrayList: " + arrayList);

        for(int i= arrayList.size()-1;i>=0;i--){
            System.out.println(arrayList.get(i));
        }

    }
}



