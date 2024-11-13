class Box1{
    double width;
    double height;
    double depth;

    void volume(){
        System.out.print("Volume is: ");
        System.out.println(width*height*depth);
    }
}

public class BoxDemo3 {
    public static void main(String args[]){
        Box1 mybox = new Box1();

        mybox.width=10;
        mybox.height=20;
        mybox.depth=15;

        mybox.volume();
    }
}
