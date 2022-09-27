package deadlocksetuation;

class Demo extends Thread
{
    private int n;
    Demo(int n){
        this.n=n;
    }
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
            try{
                this.join();
            }
            catch(Exception e)
            {
                
            }
        }
    }
}

public class DeadLockSetuation {

   
    public static void main(String[] args)throws Exception 
    {
    Demo th1=new Demo(5);
    th1.start();
    th1.join();
    Demo th2=new Demo(6);
    th2.start();
    }
    
}
