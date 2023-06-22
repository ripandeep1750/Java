public class IfStatement{
    public static void main(String arg[]){
        int x,y;
        x=10;
        y=20;
        
        if(x<y)
        System.out.println("x is less than y");
        
        x = x*2;
        if(x==y)
        System.out.println("x is equal to y");
        
        x = x*2;
        if(x>y)
        System.out.println("x is greater than y");
        
        if(x==y)
        System.out.println("This will not display anthing.....");
    }
}
