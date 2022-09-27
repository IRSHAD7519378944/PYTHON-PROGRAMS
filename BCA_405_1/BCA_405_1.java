package bca_405_1;
/////////  DEFAULT VALU OF ALL PERMITIVE DATA TYPE  ///////
class DataType
{
    int a;
    float b;
    double c;
    char d;
    String e;
    boolean f;
    byte g;
    
}
public class BCA_405_1 {
    public static void main(String[] args) {
     DataType obj=new DataType();
        System.out.println("int -> "+obj.a);
        System.out.println("float -> "+obj.b);
        System.out.println("double -> "+obj.c);
        System.out.println("char -> "+obj.d);
        System.out.println("String -> "+obj.e);
        System.out.println("boolean -> "+obj.f);
        System.out.println("byte -> "+obj.g);
}
    
}
