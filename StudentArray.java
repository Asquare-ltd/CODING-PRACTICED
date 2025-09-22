import java.util.Scanner;

class Student {
    int regNo;
    String stdName, branch;
    double CGPA;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter regNo: ");
        regNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        stdName = sc.nextLine();
        System.out.print("Enter branch: ");
        branch = sc.nextLine();
        System.out.print("Enter CGPA: ");
        CGPA = sc.nextDouble();
    }

    void display() {
        System.out.println(regNo + " " + stdName + " " + branch + " " + CGPA);
    }
}

public class Student_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[50];
        for (int i = 0; i < 50; i++) {
            arr[i] = new Student();
            arr[i].input();
        }
        int idx = 0;
        for (int i = 1; i < 50; i++) {
            if (arr[i].CGPA > arr[idx].CGPA) idx = i;
        }
        System.out.println("Topper:");
        arr[idx].display();
    }
}
