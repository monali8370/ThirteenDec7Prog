//Java Program to Show the Nesting of Methods Explanation: Enter length, breadth and height as input.
// After that we first call the volume method. From the volume method we call the area method and from the area method
//we call perimeter method. Hence we get the perimeter, area and volume of the cuboid as output.
public class Cuboid {
    public static void main(String[] args)
        {
            Cuboid C=new Cuboid();
            C.volume();
        }
        public void volume()
        {
            double l=4,b=3,h=6;
            double res=l*b*h;
            System.out.println("Volume: "+res);
            area();
        }
        public void area()
        {
            double l=4,b=3,h=6;
            double res=2*(l*b+b*h+h*h);
            System.out.println("Area: "+res);
            parameter();
        }
        public void parameter()
        {
            double l=4,b=3,h=6;
            double res=4*(l+b+h);
            System.out.println("Parameter: "+res);
        }
    }


