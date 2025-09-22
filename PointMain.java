class Point {
    int xCo, yCo;

    Point(int x, int y) {
        xCo = x;
        yCo = y;
    }

    double distanceBetPoints(Point p) {
        int dx = this.xCo - p.xCo;
        int dy = this.yCo - p.yCo;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(7, 9);
        System.out.println("Distance: " + p1.distanceBetPoints(p2));
    }
}
