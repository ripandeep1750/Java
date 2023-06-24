// DATA TYPES IN JAVA
public class Main{
    public static void main(String args[]){
        // WORKING OF LONG PRIMITIVE TYPE
// Compute distance light travels using long variables.
         int lightspeed;
        long days, seconds, distance;
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        
        System.out.println("In " +days +" days light will travel about " +distance +" miles.");
        
        //WORKING OF DOUBLE
        //To compute area of circle
        double pi, r, a;
        r=10.8;
        pi=3.1416;
        a=pi*r*r;
        System.out.println("Area of circle is " +a);
        
        //WORKING OF CHAR
        char ch1,ch2;
        ch1=88;
        ch2='Y';
        System.out.print("Ch1 and Ch2 :");
        System.out.println(ch1 +" " +ch2);
        ch2++;
        System.out.println("ch2 after increment is : " +ch2);
        
        //WORKING OF BOOLEAN
        boolean b;
        b=false;
        System.out.println("b is: " +b);
         b=true;
        System.out.println("b is: " +b);
        if(b)
        System.out.println("This is executed");
        b=false;
        if(b)
        System.out.println("This is not executed");
        System.out.println("10>9 is :" +(10>9));
}
}
