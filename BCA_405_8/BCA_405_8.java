package bca_405_8;
///// MULTI LEVEL INHERITANCE  /////////
class BCA
{
    int sbca=65;
}
class BBA extends BCA
{
    int sbba=70;
}
class BA extends BBA
{
    int sba=140;
}
class BCOM extends BA
{
    int sbcom=320;
}
class SRKG extends BCOM
{
    public void show()
    {
        System.out.println("Number of Student in BCA : "+sbca);
        System.out.println("Number of Student in BBA : "+sbba);
        System.out.println("Number of Student in BA : "+sba);
        System.out.println("Number of Student in BCOM : "+sbcom);
        int t=sbca+sbba+sba+sba+sbcom;
        System.out.println("Total Number of Student in SRKG : "+t);
    }
}
public class BCA_405_8 {
    public static void main(String[] args) {
    SRKG obj=new SRKG();
    obj.show();
    }
    
}
