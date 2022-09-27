import java.util.*;

public class Array {
  public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
      System.out.println("Enter number of sales man");
      int [][]arr=new int[s.nextInt()][];
      for(int i=0; i<arr.length; i++){
          System.out.println("Enter sales made by "+(i+1)+" sales man");
          arr[i]=new int[s.nextInt()];
          for(int j=0; j<arr[i].length; j++){
              System.out.println("Enter sale value");
              arr[i][j]=s.nextInt();
          }
      }
      for(int []brr : arr){
          int sum=0;
          for(int x : brr){
              sum=sum+x;
          }
        System.out.println("sum of salse man "+sum);
      }
  }
    
}
