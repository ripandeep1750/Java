class Box1{
    double width;
    double height;
    double depth;

    double volume(){
        return (width*height*depth);
    }

    Box1(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo3 {
    public static void main(String args[]){
        Box1 mybox = new Box1(20,14,10);

        double vol=mybox.volume();
        System.out.println("Volume is :" +vol);
    }
}
