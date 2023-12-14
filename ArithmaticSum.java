//Java Program to Find Arithmetic Sum by Passing Argument Using Method Overloading
//Explanation:This is a Java Program to Find Arithmetic Sum of 2 or 3 or 4 Variables by Passing Arguments using Method
//Overloading.Two or more methods within the same class that share the same name but with different parameter declarations
//are called overloaded methods, and the process is referred to as method overloading.Here we define a class with three
//different methods with the same name but different number of parameters. Now these methods can be
//called depending upon the number of arguments passed. Hence we get three different values as output.
public class ArithmaticSum {
    public void add(int a,int b){
        int c=a+b;
        System.out.println("c=" +c);
    }
    public void add(int a,int b,int c){
        int d=a+b+c;
        System.out.println("d=" +d);
    }
    public void add(int a,int b,int c,int d){
        int e=a+b+c+d;
        System.out.println("e=" +e);
    }

}
class ArithmaticSum1{
    public static void main(String[] args) {
        ArithmaticSum a=new ArithmaticSum();
        a.add(10,20);
        a.add(10,20,30);
        a.add(10,20,30,40);
    }
}
