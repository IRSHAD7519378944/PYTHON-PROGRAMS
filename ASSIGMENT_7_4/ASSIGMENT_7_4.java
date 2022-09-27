package assigment_7_4;
import java.util.*;

class IndexOutOfBoundException extends Exception
{

    public IndexOutOfBoundException() {
          super("Sorry Index Value not Valid !!");
    }
 
}

class ArrayDemo
{
    private int arr[];
    public void init(int s)
    {
     arr=new int[s];
    Scanner s1=new Scanner(System.in);
        System.out.println("Enter "+s+" Elemens");
        for(int i=0; i<s; i++){
            arr[i]=s1.nextInt();
        }
    }
    public int getValueAt(int index){
        try{
           if(index>=arr.length)
               throw new IndexOutOfBoundException();
        }
        catch(IndexOutOfBoundException e){
            System.out.println(e.getMessage()); 
        }
      finally{
          return arr[index];
        } 

    }

}

public class ASSIGMENT_7_4 {
    public static void main(String[] args) {
   
        ArrayDemo obj=new ArrayDemo();
          obj.init(4);
        System.out.println("value of given Index :"+obj.getValueAt(4));
    }
    
}
