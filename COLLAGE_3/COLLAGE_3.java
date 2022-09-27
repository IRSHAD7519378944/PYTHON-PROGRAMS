package collage_3;

import java.util.Scanner;

public class COLLAGE_3 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    /////////////////  1st Matrics  ///////////////
        System.out.println("Enter value of M and N for   M x N Matrics");
        int m=s.nextInt();
        int n=s.nextInt();
        int [][]arr=new int[m][n];
        System.out.println("Enter "+m+" x "+n+" Matrics");
        for(int i=0; i<m; i++){
           for(int j=0; j<n; j++){
               arr[i][j]=s.nextInt();
           } 
        }
        /////////////// 2nd Matrix  /////////////
       
        int [][]brr=new int[m][n];
        System.out.println("Enter "+m+" x "+n+" Matrics");
        for(int i=0; i<m; i++){
           for(int j=0; j<n; j++){
               brr[i][j]=s.nextInt();
           } 
        }
    ///////////// Adding  /////////////////
        System.out.println("\nAfter Adding....\n");
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
        System.out.print(" "+(arr[i][j]+brr[i][j]));
            }
            System.out.println(""); 
        }
    }
    }   

