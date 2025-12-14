package UC4;

public class Line implements Comparable<Line>{
    private final Point p1;
    private final Point p2;
    private double length;
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        calculateLength();
    }
    private void calculateLength() {
        length = Math.sqrt(
                Math.pow(p2.getX(), p2.getY())+ Math.pow(p2.getY() - p1.getY(), 2)
        );
    }
    public double getLength() {
        return length;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Line otherLine = (Line) obj;
        return Double.compare(this.length, otherLine.length) == 0;
    }

    @Override
    public int compareTo(Line otherLine) {
        return Double.compare(this.length, otherLine.length);
    }

    @Override
    public String toString() {
        return "Line[" + p1 + " to " + p2 + "] Length: " + length;
    }
}
