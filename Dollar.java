import java.util.Scanner;
public class Dollar{
    public static void main(String[] args) {
        double dollars;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dollars:");
        dollars = sc.nextDouble();
        double rupees = dollars * 82.65;
        System.out.println(rupees + " Rupees");

    }

}
