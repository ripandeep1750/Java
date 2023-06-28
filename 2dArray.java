// 2D Array
class TwoDArray{
    public static void main(String args[]){
        int twoD[][]=new int[4][5];
        int i,j,k=0;
        for(i=0;i<4;i++)
        for(j=0;j<5;j++){
            twoD[i][j]=k;
            k++;
        }
        for(i=0;i<4;i++){
            for(j=0;j<5;j++)
            System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
        
        //Manually allocate differing size second dimensions
        int arr1[][]=new int[4][];
        arr1[0]=new int[1];
        arr1[1]=new int[2];
        arr1[2]=new int[3];
        arr1[3]=new int[4];
        int a,b,c=0;
        for(a=0;a<4;a++)
        for(b=0;b<a+1;b++){
            twoD[a][b]=c;
            c++;
        }
        for(a=0;a<4;a++){
            for(b=0;b<a+1;b++)
            System.out.print(twoD[a][b] + " ");
            System.out.println();
        }
        
        //Example 3
        double m[][]={
            {0*0, 1*0, 2*0, 3*0},
            {0*1, 1*1, 2*1, 3*1},
            {0*2, 1*2, 2*2, 3*2},
            {0*3, 1*3, 2*3, 3*3}
        };
        int p,q;
        for(p=0;p<4;p++){
            for(q=0;q<4;q++)
            System.out.print(m[p][q] + " ");
            System.out.println();
        }
    }
}

