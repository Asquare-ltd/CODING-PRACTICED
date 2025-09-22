import java.util.Scanner;

class Average {
    void calculateAverage(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.println("Average: " + avg);
    }
}

public class AverageMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Average obj = new Average();
        obj.calculateAverage(x, y, z);
    }
}

