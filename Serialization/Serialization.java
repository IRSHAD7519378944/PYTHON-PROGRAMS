package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Emp implements Serializable
{
    private int id;
    private String name;
    private int sal;
    Emp()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter ID :  ");
        id=s.nextInt();
        System.out.print("Enter NAME :  ");
        s.nextLine();
        name=s.nextLine();
        System.out.print("Enter SALLARY:  ");
        sal=s.nextInt();
    }
    public void show(){
        System.out.println(id+" "+name+" "+sal);
    }
}
public class Serialization {
    
    public static void main(String[] args) {
    Emp e=new Emp();
       Emp d=new Emp();
   System.out.println("\nBefore Save in File\n");
    e.show();
    d.show();
    //////  write in file  ///////////
    try{
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Serialization.bin"));
        oos.writeObject(e);
        oos.writeObject(d);
        oos.flush();
        oos.close();
        ///////// send file over the network  ///////////
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Serialization.bin"));
        Emp e2=(Emp)ois.readObject();
        Emp e3=(Emp)ois.readObject();
System.out.println("\nAfter Save in File\n");
        e2.show();
        e3.show();
    }
    catch(Exception e1){
        System.out.println(e1);
    }
    }
    
}
