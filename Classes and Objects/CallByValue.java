// Primitive types are passed by value
// changes made to the parameter of subroutine have no effect on argument
class Test1{
    void meth(int i, int j){
        i*= 2;
        j/= 2;
    }
}

public class CallByValue {
    public static void main(String args[]){
        Test1 ob = new Test1();
        int a = 15, b = 20;
        System.out.println("a and b before call: " +a +" " +b);
        ob.meth(a,b);
        System.out.println("a and b before call: " +a +" " +b);
    }
}


OUTPUT:
a and b before call: 15 20
a and b before call: 15 20
