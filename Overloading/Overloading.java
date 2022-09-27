package overloading;

class Parent{
    public void show(int x,String s){
        System.out.println("welcome in parent "+x+"  "+s);
    }
}

class Child extends Parent{
    public void show(String s,double l){
        System.out.println("welcome in child "+s+"  "+l);
    }
}

public class Overloading {
    public static void main(String[] args) {
    Child obj=new Child();
    obj.show(20,"IRSHAD");
    obj.show("SHAMMA",4.56);
    }
}
