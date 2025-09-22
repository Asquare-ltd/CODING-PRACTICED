import java.util.Scanner;

class Employee {
    int empid;
    String ename, dept;
    double sal;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter empid: ");
        empid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        ename = sc.nextLine();
        System.out.print("Enter dept: ");
        dept = sc.nextLine();
        System.out.print("Enter salary: ");
        sal = sc.nextDouble();
    }

    void putData() {
        System.out.println(empid + " " + ename + " " + dept + " " + sal);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] arr = new Employee[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Employee();
            arr[i].getData();
        }
        for (int i = 0; i < n; i++) {
            arr[i].putData();
        }
    }
}
