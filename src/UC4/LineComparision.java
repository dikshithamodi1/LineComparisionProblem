package UC4;

import java.util.Scanner;

class LineComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Line Comparison Computation Program");

        System.out.println("Enter coordinates for Line 1:");
        Line line1 = new Line(getPoint(sc), getPoint(sc));
        System.out.println(line1);

        // Create second line
        System.out.println("Enter coordinates for Line 2:");
        Line line2 = new Line(getPoint(sc), getPoint(sc));
        System.out.println(line2);

        // UC-2: Check equality
        if (line1.equals(line2)) {
            System.out.println("The two lines are equal.");
        } else {
            System.out.println("The two lines are not equal.");
        }

        // UC-3: Compare lengths
        int result = line1.compareTo(line2);
        if (result > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else if (result < 0) {
            System.out.println("Line 2 is longer than Line 1.");
        } else {
            System.out.println("Both lines are equal in length.");
        }

        sc.close();
    }

    // Reusable method to get a Point from user input
    private static Point getPoint(Scanner sc) {
        System.out.print("Enter x coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter y coordinate: ");
        double y = sc.nextDouble();
        return new Point(x, y);
    }
}

