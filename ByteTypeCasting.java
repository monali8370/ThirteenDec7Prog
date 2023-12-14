//Java Program to Calculate Sum of Two Byte Values using Type Casting
//Explanation: This is a Java Program to Calculate Sum of Two Byte Values Using Type Casting. Type casting in Java is to
// cast one type, a class or interface, into another type i.e. another class or interface.Enter any two byte values as
// input. After that we first convert these two bytes into integers using type casting and then we add those values and
// get the desired output.

import java .util.*;
public class ByteTypeCasting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the first byte value:");
        byte num1=sc.nextByte();

        System.out.println("enter the second byte value");
        byte num2=sc.nextByte();

        int num3=(int)num1+(int)num2;
        System.out.println("the addition of"+num1+"and"+num2+"is:"+num3);
    }
}

