package collage_5;

import java.util.Scanner;

public class COLLAGE_5 {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
        System.out.println("Enter value of M and N for M x N Matrix");
        int m=s.nextInt();
        int n=s.nextInt();
        int [][]arr=new int[m][n];
        System.out.println("Enter "+m+" x "+n+" Matrix");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=s.nextInt();
            }
        }
        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]!=0)
                    count++;
            }
        }
        if(count<=(m*n/2))
            System.out.println("This is Sparse MatrIx");
        else
            System.out.println("This is Not Sparse Matrix");
    }
    
    
}
