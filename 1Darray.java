// 1D Array
class Array{
    public static void main(String args[]){
        // int month_days[];
        // month_days=new int[12];
        
        // int month_days[]=new int[12];
        
        int month_days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("April has " +month_days[3] + " days.");
        
        
        //Average of array values
        int result=0;
        int i;
        for(i=0;i<12;i++)
        result=result + month_days[i];
        System.out.println("Average is: " + result/12);
    }
}
