import java.util.Scanner;

class Area {
    int length, breadth;

    void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getArea() {
        return length * breadth;
    }
}

public class AreaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Area rect = new Area();
        rect.setDim(l, b);
        System.out.println("Area: " + rect.getArea());
    }
}
