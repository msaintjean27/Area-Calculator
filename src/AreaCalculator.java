import java.util.Scanner;
public class AreaCalculator
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printOptions(); //Print out the Title and Menu of options
        int num;
        do { // Will run program as long as number is not zero, and will run it at least once
            num = input.nextInt();

            switch (num) {
                case 0: //exit
                    input.close();
                    break;
                case 1: //circle is 2*pi*r
                    System.out.print("Please enter the radius of the circle: ");
                    double cRadius = input.nextDouble();
                    System.out.printf("\nThe area of the circle is %.3f.", circle(cRadius));
                    break;
                case 2: //triangle
                    System.out.print("Please enter the base of the triangle: ");
                    double triBase = input.nextDouble();
                    System.out.print("Please enter the height of the triangle: ");
                    double triHeight = input.nextDouble();
                    System.out.printf("\nThe area of the triangle is %.3f.", triangle(triBase, triHeight));
                    break;
                case 3: //rectangle
                    System.out.print("Please enter the width of the rectangle: ");
                    double recWidth = input.nextDouble();
                    System.out.print("Please enter the height of the rectangle: ");
                    double recHeight = input.nextDouble();
                    System.out.printf("The area of the rectangle is %.3f.", rectangle(recHeight, recWidth));
                    break;
                case 4: //square
                    System.out.print("Please enter the side of the square: ");
                    double sSide = input.nextDouble();
                    System.out.printf("The area of the square is %.3f.", square(sSide));
                    break;
                case 5: //trapezoid
                    System.out.print("Please enter the top of the trapezoid: ");
                    double trapTop = input.nextDouble();
                    System.out.print("Please enter the bottom of the trapezoid: ");
                    double trapBottom = input.nextDouble();
                    System.out.print("Please enter the height of the trapezoid: ");
                    double trapHeight = input.nextDouble();
                    System.out.printf("The area of the trapezoid is %.3f.", trapezoid(trapTop, trapBottom, trapHeight));
                    break;
                default:
                    System.out.print("Try again: "); // will run if number is not 0-5
            }
        } while (num != 0);

    }
    public static void printOptions() // will print menu and options
    {
        Scanner input = new Scanner(System.in);
        System.out.println("********** Area Calculator **********\n" +
                "0) Exit\n" +
                "1) Circle\n" +
                "2) Triangle\n" +
                "3) Rectangle\n" +
                "4) Square\n" +
                "5) Trapezoid");
        System.out.print("Please enter your option (0-5): ");
    }
    public static double pi() //using pi() instead of actual number
    {
        return 3.14159;
    }
    public static double circle(double radius) //circle formula
    {
        double area = pi()*Math.pow(radius, 2);
        return area;
    }
    public static double triangle(double base,double height) //triangle formula
    {
        return 0.5 * base * height;
    }

    public static double rectangle(double length, double width) //rectangle is length*width
    {
        return length*width;
    }

    public static double square(double side) //square is side * side
    {
        return side*side;
    }

    public static double trapezoid(double top, double bottom, double height)//trapezoid is 0.5 * (top+bottom) * height
    {
        return 0.5 * (top+bottom) * height;
    }
}


/*

TEST DATA - 1
********** Area Calculator **********
0) Exit
1) Circle
2) Triangle
3) Rectangle
4) Square
5) Trapezoid
Please enter your option (0-5): 0

Process finished with exit code 0


TEST DATA - 2

********** Area Calculator **********
0) Exit
1) Circle
2) Triangle
3) Rectangle
4) Square
5) Trapezoid
Please enter your option (0-5): 1
Please enter the radius of the circle: 5.2

The area of the circle is 84.949.
Process finished with exit code 0

TEST DATA - 3
********** Area Calculator **********
0) Exit
1) Circle
2) Triangle
3) Rectangle
4) Square
5) Trapezoid
Please enter your option (0-5): 2
Please enter the base of the triangle: 10
Please enter the height of the triangle: 4.6

The area of the triangle is 23.000.
Process finished with exit code 0


TEST DATA - 4
********** Area Calculator **********
0) Exit
1) Circle
2) Triangle
3) Rectangle
4) Square
5) Trapezoid
Please enter your option (0-5): 3
Please enter the width of the rectangle: 2.5
Please enter the height of the rectangle: 6.5
The area of the rectangle is 16.250.
Process finished with exit code 0

TEST DATA - 5
********** Area Calculator **********
0) Exit
1) Circle
2) Triangle
3) Rectangle
4) Square
5) Trapezoid
Please enter your option (0-5): 4
Please enter the side of the square: 4.56789

The area of the square is 20.866.
Process finished with exit code 0


TEST DATA - 6
********** Area Calculator **********
0) Exit
1) Circle
2) Triangle
3) Rectangle
4) Square
5) Trapezoid
Please enter your option (0-5): 5
Please enter the top of the trapezoid: 1.2
Please enter the bottom of the trapezoid: 3.4
Please enter the height of the trapezoid: 6
The area of the trapezoid is 13.800.
Process finished with exit code 0


TEST DATA - 7

********** Area Calculator **********
0) Exit
1) Circle
2) Triangle
3) Rectangle
4) Square
5) Trapezoid
Please enter your option (0-5): 6
Try again: 6
Try again: 5
Please enter the top of the trapezoid: 0
Please enter the bottom of the trapezoid: 0
Please enter the height of the trapezoid: 0
The area of the trapezoid is 0.000.

 */
