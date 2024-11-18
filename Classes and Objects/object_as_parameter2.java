// When you want to create a new object , same as existing object.
// Define a constructor that takes object of its class as parameter.
class Box4{
    double width;
    double height;
    double depth;

    Box4(Box4 ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box4(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Box4(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box4(double len){
        width = height = depth = len;
    }

    double volume(){
        return width*height*depth;
    }
}

public class OverloadCons2 {
    public static void main(String args[]){
        Box4 mybox1 = new Box4(10,20,15);
        Box4 mybox2 = new Box4 ();
        Box4 mycube = new Box4(7);

        Box4 myclone = new Box4(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " +vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " +vol);

        vol = mycube.volume();
        System.out.println("Volume of cube is " +vol);

        vol = myclone.volume();
        System.out.println("Volume of clone is " +vol);
    }
}


Volume of mybox1 is 3000.0
Volume of mybox2 is -1.0
Volume of cube is 343.0
Volume of clone is 3000.0
