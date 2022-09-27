
class Licence
{
    private String name;
    private String DOB;

    public Licence(String n,String dob) {
     name=n;
     DOB=dob;
    }
    public void show(){
        System.out.println(name+" "+DOB);
    }
    public void canDrive()
    {
        //I'm not uderstand how can calculate DOB becouse dob is string
    }
    
}

public class LicenceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Licence obj=new Licence("irshad","16/07/2000");
       obj.show();          
    }
}
