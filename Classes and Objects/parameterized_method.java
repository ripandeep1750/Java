class Box1{
    double width;
    double height;
    double depth;

    double volume(){
        return (width*height*depth);
    }

    void setDim(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
}

public class BoxDemo3 {
    public static void main(String args[]){
        Box1 mybox = new Box1();

        mybox.setDim(15,25,10);

        double vol=mybox.volume();
        System.out.println("Volume is :" +vol);
    }
}
