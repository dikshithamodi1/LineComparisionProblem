public class Point {
    double x;
    double y;
    Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }//i have to provide x and y values during initilization
}
