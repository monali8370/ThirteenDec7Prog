//Java Program to create an Area of triangle and rectangle and Passing and Returning Objects in Java
//Explanation:Enter length and breadth of the rectangle as input. After that we create an object of that
//class and pass the reference variable to two different methods. Now we calculate the area for two different objects
//  and return them to the main method. Hence we get two different areas as output.
import java.util.*;
public class TriangleReactangle {
    public static void main(String[] args)
        {
            TriangleReactangle ob=new TriangleReactangle();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter: ");
            double length=sc.nextDouble();
            double breadth=sc.nextDouble();
            System.out.println("Area of triangle: "+ob.tri(length, breadth));
            System.out.println("Area of rectangle: "+ob.rect(length, breadth));
        }
        public double tri(double length, double breadth)
        {
            return 0.5*length*breadth;
        }
        public double rect(double length, double breadth)
        {
            return length*breadth;
        }
    }

