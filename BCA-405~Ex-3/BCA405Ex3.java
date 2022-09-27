package bca.pkg405.ex.pkg3;
import java.util.*;
//  1.  //////////////////////////////////
/* class BCA
{
    public static void sum(int a,int b){
        int c;
        c=a+b;
        System.out.println("sum is : "+c);
}
    public static void sub(int a,int b){
        int c;
        c=a-b;
        System.out.println("sub is : "+c);
}
    public static void mul(int a,int b){
        int c;
        c=a*b;
        System.out.println("mul is : "+c);
}
    public static void div(int a,int b){
        int c;
        c=a/b;
        System.out.println("div is : "+c);
}
    public static void mod(int a,int b){
        int c;
        c=a%b;
        System.out.println("mod is : "+c);
}
}  */

//  2.  //////////////////////////////////////

class MCA
{
    MCA(){
        System.out.println("Hii !! Irsha 'U' 'R' enter Default constructor");
    }
   void  MCA(){
        System.out.println("Hii !! Irsha 'U' 'R' enter TNRN method not a constrctor");
    }
    MCA(int a){
        System.out.println("Hii !! Irsha 'U' 'R' passing valu "+a+" in constructor");
    }
    void MCA(int a){
        System.out.println("Hii !! Irsha 'U' 'R' passing valu "+a+" in TSRN method not constructor");
    }
    MCA(MCA obj1){
        System.out.println("Hii !! Irsha 'U' 'R' passing class object in constructor");
    }
}

public class BCA405Ex3 {
    public static void main(String[] args) {
     MCA obj=new MCA();
     obj.MCA();
     obj.MCA(20);
     new MCA(obj); 
      new MCA(16);     
    }
    
}
