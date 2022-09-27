
package produceconsumerproblem;

class SharedData
{
    private int n;
    private boolean writable=true;
    public synchronized void set(int n)throws InterruptedException
    {
        if(writable==false)
            wait();
        this.n=n;
        System.out.println("produced:"+n);
        writable=false;
        notify();
    }
    public synchronized int get()throws InterruptedException
    {
        if(writable==true)
            wait();
          writable=true;
          notify();
          System.out.println("consumed:"+n);
          return n;
    }
}

class Producer extends Thread
{
    SharedData s;

    public Producer(SharedData s) {
    this.s=s;
    }
    @Override
    public void run()
    {
        try{
            for(int i=1; i<=10; i++)
            {
                s.set(i);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}

class Consumer extends Thread
{
    SharedData s;

    public Consumer(SharedData s) {
    this.s=s;
    }
    @Override
    public void run()
    {
        int sum=0;
        int x;
        try{
            do{
                x=s.get();
                sum=sum+x;
            }while(x!=10);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("sum is : "+sum);
    }
}

public class ProduceConsumerProblem {
    public static void main(String[] args) {
        SharedData obj=new SharedData();
        Producer p=new Producer(obj);
        Consumer c=new Consumer(obj);
        p.start();
        c.start();
    }
    
}
