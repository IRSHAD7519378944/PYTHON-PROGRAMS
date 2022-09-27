import java.util.*;
class AgeNotValidException extends Exception
{

    public AgeNotValidException() {
    super("Age not valid");
    }
    
}
class Demo
{
    public void a()throws AgeNotValidException
    {
       b();
    }
    public void b()throws AgeNotValidException
    {
        c();
    }
    public void c()throws AgeNotValidException
    {
       d();
    }
    public void d()throws AgeNotValidException
    {
        int x=10;
        int y=0;
         int z=x/y;
         throw new AgeNotValidException();
    }
}
public class ExceptionDemo {
    public static void main(String[] args) {
    Demo obj=new Demo();
    try{
    obj.a();
 }
    catch(Exception e){
        System.out.println(e);
    }
        System.out.println("Hii");
    }
}