public class forLoop{
    public static void main(String args[]){
        int x;
        for(x=0;x<10;x=x+1){
            System.out.println("Value of x is: " +x);
        }
    }
}

//WHILE LOOP
class While{
    public static void main(String args[]){
        int n=10;
        while(n>0){
            System.out.println("tick " +n);
            n--;
        }
    }
}

//Nobody of loop
class NoBody{
    public static void main(String args[]){
        int i,j;
        i=100;
        j=200;
        
        //find mid point of i and j
        while(++i < --j);
        
        System.out.println("Midpoint is " +i);
    }
}

//DO WHILE LOOP
class DoWhile{
    public static void main(String args[]){
        int n=10;
        do{
            System.out.println("tick " +n);
            n--;
        }while(n>0);
    }
}
