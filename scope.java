
class Main{
    public static void main (String args[]){
        //Dynamic initialization
        double a=3.0, b=4.0;
        double c=Math.sqrt(a*a + b*b);  //c is dynamically initialized
        System.out.println("Hypotenuse is " +c);
        
        //Block Scope
        int x;
        x=10;
        if(x==10){
            int y=20;
            System.out.println("x and y: " +x +" " +y);
            x=y*2;
        }
        //y=100; //error;
        System.out.println("x is " +x);
        
        //Lifetime of a variable
        int r;
        for(r=0;r<3;r++){
            int p=-1;
            System.out.println("p is: " +p);
        p=100;
        System.out.println("p is now: " +p);
        }
    }
}
