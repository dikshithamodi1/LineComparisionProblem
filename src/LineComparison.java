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

        //uc3
        int result=line.compareTo(line2);
        if(result>0){
            System.out.println("Line 1 is longer than the Line 2");
        } else if (result<0) {
            System.out.println("Line 2 is shorter than the Line 1");
        }else{
            System.out.println("Line 1 is equal to the Line 2");
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
