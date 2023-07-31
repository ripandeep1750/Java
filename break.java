// break as a civilized form of goto
public class Main
{
	public static void main(String[] args) {
		boolean t =true;
		first:{
		    second:{
		        third:{
		            System.out.println("Before the break.");
		            if(t)
		            break second;    // break out of second block
		            System.out.println("This won't execute");
		        }
		        System.out.println("This won't execute");
		    }
		    System.out.println("This is after second block.");
		}
	}
}



----------------------------------------------------------------------------------------
class BreakExample {
	public static void main (String[] args) {
		outer: for(int i=0;i<3;i++){
		    System.out.print("Pass " +i +":");
		    for(int j=0;j<100;j++){
		        if(j==10)
		        break outer;  // exit both loops
		        System.out.print(j+" ");
		    }
		    System.out.println("This will not print.");
		}
		System.out.println("Loops complete.");
	}
}

OUTPUT:- Pass 0:0 1 2 3 4 5 6 7 8 9 Loops complete.
