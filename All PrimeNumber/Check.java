
import java.util.*;

class Method()
        {
   public static void prime(int n)
   {
       int i;
       for(i=2; i<n; i++)
       {
           if(n%i==0)
               break;
       }
       if(i==n)
      System.out.println(i+" Is A Prime Number");
       else
        System.out.println(i+" Is Not A Prime Number");
 
   }
}
class Check {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Method obj;
      obj.prime(3);
    }
    
}
