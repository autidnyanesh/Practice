package No;

import java.util.Scanner;

class Employee{
    private int employee_id;
    private String employee_name;
    private int employee_salary;
    public int getEmployee_id() {
        return employee_id;
    }
    public String getEmployee_name() {
        return employee_name;
    }
    public int getEmployee_salary() {
        return employee_salary;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
    public void setEmployee_salary(int employee_salary) {
        this.employee_salary = employee_salary;
    }
    public String displayEmployeeDetails() {
        return "Employee ID: " + employee_id + "\nEmployee Name: " + employee_name + "\nEmployee Salary: $" + employee_salary;
    }

}
public class Encapsulation1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Employee obj=new Employee();

        System.out.println("Enter the name of the Employee: ");
        obj.setEmployee_name(sc.next());

        System.out.println("Employee ID: ");
        obj.setEmployee_id(sc.nextInt());

        System.out.println("Employee salary: ");
        obj.setEmployee_salary(sc.nextInt());

        System.out.println(obj.displayEmployeeDetails());





    }
}
