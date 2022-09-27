package producerconsumerproblem;


class SharedData
{
    private int n;
    private boolean writable=true;
    
    public synchronized void set(int n)throws InterruptedException
    {
        if(writable==false)
            wait();
        this.n=n;
        System.out.println("produced -> "+n);
        writable = false;
        notify();
    }
    
    public synchronized int get()throws InterruptedException
    {
        if(writable==true)
            wait();
        System.out.println("consumed -> "+n);
        writable = true;
        notify();
        return n;
    }
}

class Producer extends Thread
{
   SharedData s=new SharedData();

    public Producer(SharedData s) {
        this.s=s;
    }
    public void run(){
        try{
           for(int i=1; i<=10; i++){
               s.set(i);
           } 
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
   
}

class Consumer extends Thread
{
    SharedData s=new SharedData();

    public Consumer(SharedData s) {
        this.s=s;
    }
    public void run(){
        int x;
        int sum=0;
        try{
        do{
         x=s.get();
         sum=sum+x;
        }while(x!=10);
    }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("SUM IS : "+sum);
    
}
}
public class ProducerConsumerProblem {

    public static void main(String[] args) {
     SharedData obj=new SharedData();
     Producer p=new Producer(obj);
     Consumer c=new Consumer(obj);
     p.start();
     c.start();
    }
    
}