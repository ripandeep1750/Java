// one or more variables in for loop
class Sample{
    public static void main(String args[]){
        int a, b;
        for(a=1,b=4;a<b;a++,b--){
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        }
    }
}

---------------------------------------------------------------------------------------------
class Main {
	public static void main (String[] args) {
		int nums[]={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int x:nums){
		    System.out.println("Value is: " +x);
		    sum+=x;
		    if(x==5)
		    break;
		}
		System.out.println("Summation: " +sum);
	}
}

---------------------------------------------------------------------------------------------
class Main {
	public static void main (String[] args) {
		int nums[]={1,2,3,4,5,6,7,8,9,10};
		int value=7;
		boolean found=false;
		for(int x:nums){
		   if(x==value)
		   found=true;
		    break;
		}
		System.out.println("Element found.");
	}
}

-----------------------------------------------------------------------------------------
class Main {
	public static void main (String[] args) {
		int i,j;
		for(i=0;i<10;i++){
		for(j=i;j<10;j++)
		System.out.print(".");
		System.out.println();
		}
	}
}
..........
.........
........
.......
......
.....
....
...
..
.

 -----------------------------------------------------------------------------------------
  class Sample{
    public static void main(String args[]){
       int num[][]= new int [3][5];
       int i,j;
       int sum=0;
       
       //assign values
        for(i=0;i<3;i++)
        for(j=0;j<5;j++)
        num[i][j]=(i+1)*(j+1);
        
        //print the Array
        for(int x[]:num){
            for(int y:x){
                System.out.println("Value is: " +y);
                sum+=y;
            }
        }
        System.out.println("Summation is: " +sum);
    }
}
