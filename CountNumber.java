//Java Program to Count Number of Objects Created for Class
//Explanation:Whenever an object is made of a class, its constructor is invoked. Whenever the constructor runs we
// increment the counter value.Hence the number of objects created of a class equals the counter value.
class CountNumber {
    static int i;
    CountNumber()
        {
            i++;
        }

        public static void main(String[] args)
        {
            CountNumber a=new CountNumber();
            CountNumber b=new CountNumber();
            System.out.println(i);
        }
}


