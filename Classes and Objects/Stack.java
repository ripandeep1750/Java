class Stack{
    int stck[] = new int [10];
    int tos;

    //initialise top-of-stack
    Stack(){
        tos = -1;
    }

    //push
    void push(int item){
        if(tos==9)
            System.out.println("Stack is full.");
        else
            stck[++tos]=item;
        }

        //pop
    int pop(){
        if(tos<0){
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

public class TestStack {
    public static void main(String args[]){
        Stack mystack = new Stack();

        //push
        for(int i=0; i<10; i++)
            mystack.push(i);

        //pop
        System.out.println("Items in my stack");
        for(int i=0; i<10; i++)
            System.out.println(mystack.pop());
    }
}
