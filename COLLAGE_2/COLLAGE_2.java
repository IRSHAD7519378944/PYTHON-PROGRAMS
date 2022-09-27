package collage_2;

import java.util.Scanner;

class BCA{
    private String name;
    public BCA() {
        Scanner s=new Scanner(System.in);
        name=s.nextLine();
    }
    public void show(){
        System.out.println(name);
    }
    
    public static void sortString(BCA arr[]){
        int i,j;
        BCA temp;
      for(i=0; i<arr.length; i++)
      {   
        for(j=i+1;j<arr.length; j++)
        {
            if(arr[i].name.compareTo(arr[j].name)>0)
            {
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        }
    }
}


public class COLLAGE_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("How many String Enter you Want : ");
        BCA []arr=new BCA[s.nextInt()];
        
        BCA []brr=new BCA[5];
        if(arr.length<5)
            System.out.println("Please Enter 5 or more string");
        else{
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter String"+(i+1)+" : ");
            arr[i]=new BCA();
        }
/////////  copy first five string into brr ///////////
        for(int i=0; i<5; i++){
           brr[i]=arr[i];
        }
 //////////  sort all element of brr /////////////
       BCA.sortString(brr);
 ///////// assign all sorted string of brr into arr  //////////
        for(int i=0; i<brr.length; i++){
            arr[i]=brr[i];
        }
 /////////////// print new array of string  ////////////
        System.out.println("\n\tAfter Sorting.....\n");
        for(BCA x : arr){
            x.show();
        }
    }
    
}
}
/*  complete   */

