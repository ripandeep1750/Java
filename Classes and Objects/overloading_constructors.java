class Box3{
    double width;
    double height;
    double depth;

    Box3(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }

    Box3(){
        width=-1;
        height=-1;
        depth=-1;
    }

    Box3(double len){
        width=height=depth=len;
    }

    double volume(){
        return width*height*depth;
    }
}

public class OverloadCons {
    public static void main(String args[]){
        Box3 mybox1 = new Box3(10,20,15);
        Box3 mybox2 = new Box3();
        Box3 mycube = new Box3(7);

        double vol;
        vol=mybox1.volume();
        System.out.println("Volume of mybox1 is " +vol);

        vol=mybox2.volume();
        System.out.println("Volume of mybox2 is " +vol);

        vol=mycube.volume();
        System.out.println("Volume of cube is " +vol);
    }
}
