import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Comparision problem");

        Line l1 = new Line(getPoint(), getPoint());
        l1.calculateLength();
        System.out.println("Length of line 1: " + l1.length);

        Line l2 = new Line(getPoint(), getPoint());
        l2.calculateLength();
        System.out.println("Length of line 2: " + l2.length);

        if (l1.length > l2.length) {
            System.out.println("Line 1 is longer than Line 2");
        } else if (l1.length < l2.length) {
            System.out.println("Line 2 is longer than Line 1");
        } else {
            System.out.println("Both lines are equal in length");
        }
    }

    public static Point getPoint() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x coordinate:");
        double x = sc.nextDouble();
        System.out.println("enter y coordinate:");
        double y = sc.nextDouble();
        return new Point(x, y);
    }
}
