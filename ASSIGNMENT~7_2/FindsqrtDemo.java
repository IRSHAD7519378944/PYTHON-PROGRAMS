class NegativeException extends Exception{

    public NegativeException() {
    super("Number must be positive");
    }
    
}
class ComplexNumberException extends Exception{

    public ComplexNumberException() {
    super("Sorry ! Number must be Natural only");
    }
    
}
class Findsqrt
{
    private int num;
    public void getNumber(int n){
      num=n;  
    }
    public void calculate()
    {
        try{
      if(num>=1){
          System.out.println(Math.sqrt(num));
       } 
      else if(num<0){
          throw new NegativeException();
      }
      else{
          throw new ComplexNumberException();
      }
    }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

public class FindsqrtDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Findsqrt obj=new Findsqrt();
     obj.getNumber(400);
     obj.calculate();
    }
    
}
