package collage_1;
import java.util.Scanner;
public class COLLAGE_1 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        System.out.println("How many Number Enter you want");
        int n=s.nextInt();
        int []arr=new int[n];
        int []brr=new int[5];
        if(n<5)
            System.out.println("Please Enter 5 element or more");
        else{
            System.out.println("Enter "+n+" Elements");
            for(int i=0; i<n; i++){
                arr[i]=s.nextInt();
            }
  ////////////  copy first five elements of arr into brr  ///////////
          for(int i=0; i<5; i++){
                brr[i]=arr[i];
           }
/////////////// sort brr ///////////////////////////
        Function.shortArray(brr);
 ///////////  after sort brr copy into arr ///////////
            for(int i=0; i<brr.length; i++){
                arr[i]=brr[i];
            }
 //////////  print new arr  //////////
           for(int i=0; i<arr.length; i++)
            {   
            System.out.print(arr[i]+" ");
          }
        }
}
}

class Function
{
    public static void shortArray(int []brr){
       int i,j,temp;
      for(i=0; i<brr.length; i++)
      {   
        for(j=i+1;j<brr.length; j++)
        {
            if(brr[j]<brr[i])
            {
                temp=brr[j];
                brr[j]=brr[i];
                brr[i]=temp;
            }
        }
        
    }
    }
}
/*  complete    */