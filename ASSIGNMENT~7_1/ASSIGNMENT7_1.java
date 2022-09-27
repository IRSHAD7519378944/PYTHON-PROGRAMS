package assignment.pkg7_1;
 class Licence
{
    private String name;
    private String dob;

    public Licence(String name,String dob) {
        this.name=name;
        this.dob=dob;
    }
    public int canDrive()
    {
      int count=2022-Integer.parseInt(dob);
      return count;
    }
    
}

class AgeNotFoundException extends Exception
{

    public AgeNotFoundException() {
    super("You are not eligable for voating ");
    }
    
}


public class ASSIGNMENT7_1 {
    public static void main(String[] args) {
  Licence l=new Licence("Irshad","2010");
    try{
         if(l.canDrive()<18)
             throw new AgeNotFoundException();
         else
         System.out.println("You are Elegible for Vote");
    }
    catch(Exception e){
            System.out.println(e.getMessage());
    }
    }
    
}
