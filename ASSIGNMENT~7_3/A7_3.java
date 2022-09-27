import java.util.*;
class PasswordMismatchException extends Exception
{
    public PasswordMismatchException() {
    super(" Incorrect psw Try again!!!");
    }
class PasswordVarificationExpirsException extends Exception
{

        public PasswordVarificationExpirsException() {
    super("Time out!!!");
        }
    
}
class 
}
class Password
{
    private String psw;

    public Password(String p) {
        psw=p;
    }
public void getPassword(String p){
    try{
    if(!psw.equals(p)){
      throw new PasswordMismatchException();
    }
    else{
        System.out.println("Welcome To New India");
    }
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
public void checkPassword()
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter password");
     getPassword(s.nextLine());
}
}
public class A7_3 {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Password obj=new Password("irshad");
     obj.checkPassword();
    }
    }

