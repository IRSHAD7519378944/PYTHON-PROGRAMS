package assignment_8_3;

class Table1
{
    public synchronized void pritTable1(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
class Table2
{
    public synchronized void pritTable2(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
class Thread1 extends Thread
{
    Table1 t1=new Table1();
    Table2 t2=new Table2();

    public Thread1(Table1 t1,Table2 t2) {
    this.t1=t1;
    this.t2=t2;
    }
    @Override
    public void run(){
        t1.pritTable1(11);
        t2.pritTable2(12);
    }
    
}

class Thread2 extends Thread
{
    Table1 t=new Table1();

    public Thread2(Table1 t) {
    this.t=t;
    }
    @Override
    public void run(){
        t.pritTable1(13);
    }
    
}

class Thread3 extends Thread
{
    Table1 t=new Table1();

    public Thread3(Table1 t) {
        this.t=t;
    }
    @Override
    public void run(){
        t.pritTable1(15);
    }
}

public class ASSIGNMENT_8_3 {

    public static void main(String[] args) {
   Table1 t1=new Table1();
   Table2 t2=new Table2();
   Thread1 th1=new Thread1(t1,t2);
   Thread2 th2=new Thread2(t1);
   Thread3 th3=new Thread3(t1);
    th1.start();
    th2.start();
    th3.start();
    }
    
}
