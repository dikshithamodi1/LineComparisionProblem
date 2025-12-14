public class Line implements Comparable<Line> {
    Point p1;
    Point p2;
    double length;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double calculateLength() {
        this.length = Math.sqrt(
                Math.pow(p2.x - p1.x, 2) +
                        Math.pow(p2.y - p1.y, 2)
        );

        return length;
    }

    //without override  it checks memory address
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Line otherLine = (Line) obj;
        return Double.compare(this.length, otherLine.length) == 0;
    }
    //UC3
    @Override
    public int compareTo(Line otherLine) {
        return Double.compare(this.length, otherLine.length);
    }
}
