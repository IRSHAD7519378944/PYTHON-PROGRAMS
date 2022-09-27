package jackeda_rray;

import java.util.Scanner;

public class JACKEDA_RRAY {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        System.out.println("Enter no of salses man");
        int [][]arr=new int[s.nextInt()][];
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter sale made by "+(i+1)+" salse man");
            arr[i]=new int[s.nextInt()];
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.println("Enter sale value");
                arr[i][j]=s.nextInt();
            }
        }
        for(int []brr : arr){
            int sum=0;
            for(int x : brr){
                System.out.print(" "+x);
                sum=sum+x;
            }
            System.out.println("    sum is :"+sum);
        }
    }
    
}
