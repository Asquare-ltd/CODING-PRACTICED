class ComplexNum {
    int real, img;

    ComplexNum(int r, int i) {
        real = r;
        img = i;
    }

    void displayCompNumber() {
        System.out.println(real + "+" + img + "i");
    }

    ComplexNum addCompNumber(ComplexNum c) {
        return new ComplexNum(this.real + c.real, this.img + c.img);
    }
}

public class ComplexNumMain {
    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum(4, 5);
        ComplexNum c2 = new ComplexNum(3, 7);
        ComplexNum sum = c1.addCompNumber(c2);
        sum.displayCompNumber();
    }
}
