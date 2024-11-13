class Box1{
    double width;
    double height;
    double depth;

    double volume(){
        return (width*height*depth);
    }
}

public class BoxDemo3 {
    public static void main(String args[]){
        Box1 mybox = new Box1();

        mybox.width=10;
        mybox.height=20;
        mybox.depth=30;

        double vol=mybox.volume();
        System.out.println("Volume is :" +vol);
    }
}
