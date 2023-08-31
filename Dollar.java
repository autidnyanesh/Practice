import java.util.Scanner;
public class Dollar{
    public static void main(String[] args) {
        float dollars;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dollars:");
        dollars = sc.nextLong();
        float rupees = dollars * 82;
        System.out.println(rupees + " Rupees");

    }

}
