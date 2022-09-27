package assignment_7_3;

import java.util.Scanner;

class PasswordMismatchException extends Exception
{

    public PasswordMismatchException() {
    super("Worng Password TRY AGAIN !!");
    
}
}

class PasswordVarificationExpiresException extends Exception
{

    public PasswordVarificationExpiresException() {
     super("Your Varification Time out !!!");
    }
    
}
        

class Password
{
    public String psw;

    public Password(String psw) {
    this.psw=psw;
    }
    public void get_psw()
    {
        int count=1;
        while(count<=3){
        try{
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Password : ");
        String new_psw=s.nextLine();
        if(psw.matches(new_psw)==false)
        { 
            if(count==3)
        throw new PasswordVarificationExpiresException();
            throw new PasswordMismatchException();

        }
        else{
              System.out.println("welcome");
              break;
        }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            count++;
        }
    }
}
}

public class ASSIGNMENT_7_3 {
    public static void main(String[] args) {
   Password obj=new Password("min");
   obj.get_psw();
    }
    
}
  //   complete