package singleinheritance;
class Single{
    int a=10;
    int b=20;
}
class Single2 extends Single{
    public void show()
    {
        System.out.println("a= "+a+" b= "+b);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
     Single2 b=new Single2();
     b.show();
    }
    
}
