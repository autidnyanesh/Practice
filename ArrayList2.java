import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        //ArrayList<Integer> arr=new ArrayList<Integer();
        ArrayList<String> arr1=new ArrayList<String>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of the ArrayList: ");
        int sizee= sc.nextInt();

        System.out.println("Enter the First name of "+sizee+ " students: ");
        for(int i=0;i<sizee;i++){
           String value=sc.next();
           arr1.add(value);
        }

        System.out.println("First Name of "+sizee+" students :"+arr1);
        ArrayList<String> arr2=new ArrayList<String>();
        System.out.println("Enter the Last name of "+sizee+ " students: ");
        for(int i=0;i<sizee;i++){
            String val=sc.next();
            arr2.add(val);
        }
        System.out.println("Last Name of "+sizee+" students :"+arr2);

        //arr1.addAll(arr2);
        System.out.println(" Full name are :");
        for(int i=0;i<sizee;i++){
            System.out.println(arr1.get(i)+" "+arr2.get(i));
        }
        //System.out.println("Full Name are: "+arr1);

    }
}
