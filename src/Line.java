public class Line {
    Point p1;
    Point p2;
    double length;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void calculateLength() {
        this.length = Math.sqrt(
                Math.pow(p2.x - p1.x, 2) +
                        Math.pow(p2.y - p1.y, 2)
        );

        System.out.println("The length of the line is: " + this.length);
    }
}
