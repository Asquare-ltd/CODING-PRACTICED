import java.util.Scanner;

class Student {
    String name, branch;
    int roll_no;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll no: ");
        roll_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter branch: ");
        branch = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Branch: " + branch);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.inputDetails();
        s.displayDetails();
    }
}
