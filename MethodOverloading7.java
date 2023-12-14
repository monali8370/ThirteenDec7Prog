//Java Program to Find Area of Square, Rectangle and Circle using Method OverloadingExplanation
// This is a Java Program to Find Area of Square, Rectangle and Circle using Method Overloading.
//We declare three methods of the same name but with different numbers of arguments or with
// different data types. Now when we call these methods using objects, corresponding methods
//will be called as per the number of arguments or their data types.
class MethodOverloading{
    public static void main(String[] args)
    {
        MethodOverloading ob=new MethodOverloading();
        System.out.println(ob.sq(4));
        System.out.println(ob.rect(4,6,4));
        System.out.println(ob.circle(3));
    }
    public double sq(double side)
    {
        return side*side;
    }
    public double rect(double l, double b, double h)
    {
        return l*b*h;
    }
    public double circle(double radius)
    {
        return 3.14*radius*radius;
    }
}
