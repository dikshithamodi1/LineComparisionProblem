import java.util.Scanner;

class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Line line = new Line(getPoint(), getPoint());
        double length = line.calculateLength();

        System.out.println("Length of the line is: " + length);

        Line line2=new Line(getPoint(),getPoint());
        length=line2.calculateLength();
        System.out.println("Length of the line 2 is: " + length);

        //UC2
        if(line.equals(line2)){
            System.out.println("The two lines are the same");
        }else{
            System.out.println("The two lines are not the same");
        }
    }

    public static Point getPoint() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate:");
        double x = sc.nextDouble();
        System.out.println("Enter y coordinate:");
        double y = sc.nextDouble();
        return new Point(x, y);
    }
}
