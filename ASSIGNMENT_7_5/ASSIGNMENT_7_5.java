package assignment_7_5;
/**
 *
 * @author IRSHAD
 */

class InvalidAmmountException extends Exception
{

    public InvalidAmmountException() {
    super("Invalid Ammount : please try again!!");
    }
    
}

class Account
{
    private int acc_no;
    private String name;
    private double bal;
    
    public void getData(int acc_no,String name, double bal){
        this.acc_no=acc_no;
        this.name=name;
        this.bal=bal;
    }
 
    public void depsit(int d){
        try{
            if(d<=0)
                throw new InvalidAmmountException();
               bal=bal+d;
        }
        catch(InvalidAmmountException e){
                System.out.println(e.getMessage());
                }
    }
    public void withdrawal(int w){
        try{
            if(w<=0)
                throw new InvalidAmmountException();
               bal=bal-w;
        }
        catch(InvalidAmmountException e1){
            System.out.println(e1.getMessage());
        }
    }
    public void show(){
        System.out.println("A/C NO : "+acc_no);
        System.out.println("NAME : "+name);
        System.out.println("BALLANCE : "+bal);
    }
}

public class ASSIGNMENT_7_5 {

    public static void main(String[] args) {
     Account a=new Account();
     a.getData(467710110, "Md Irshad Nadaf",5000);
     a.show();
     a.depsit(15500);
     a.show();
     a.withdrawal(500);
     a.show();
    }
    
}
