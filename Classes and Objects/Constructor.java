class Box1{
    double width;
    double height;
    double depth;

    double volume(){
        return (width*height*depth);
    }

    Box1(){
        width=10;
        height=20;
        depth=16;
    }
}

public class BoxDemo3 {
    public static void main(String args[]){
        Box1 mybox = new Box1();

        double vol=mybox.volume();
        System.out.println("Volume is :" +vol);
    }
}
