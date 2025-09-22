import java.util.Scanner;

class Complex {
    int real, imag;

    void initialise() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        real = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        imag = sc.nextInt();
    }

    void show() {
        System.out.println(real + " + " + imag + "i");
    }

    Complex add(Complex c) {
        Complex temp = new Complex();
        temp.real = this.real + c.real;
        temp.imag = this.imag + c.imag;
        return temp;
    }
}

public class ComplexMain {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.initialise();
        c2.initialise();
        Complex sum = c1.add(c2);
        System.out.print("Sum = ");
        sum.show();
    }
}
