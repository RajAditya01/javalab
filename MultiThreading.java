class A extends Thread
{
    public void run ()
    {
        for (int i=1; i<=5; i++)
        {
            if(i==3)
    {
        System.out.println("First thread yield");
        Thread.yield();
    }
    System.out.println("A="+i);
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            if(j==2)
            {
                try
                {
                    System.out.println("Second thread sleeping.");
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
            System.out.println("B="+j);
        }
    }
}

class C extends Thread 
{
    public void run()
    {
        for (int k=1; k<=5; k++)
        {
            if(k==4)
            {
                stop();
            }
            System.out.println("C="+k);
        }
    }
}

class MultiThreading 
{
    public static void main(String[] args) {
        {
            System.out.println("Start under main");
            A t1=new A();
            B t2=new B();
            C t3=new C();
            t1.start();
            t2.start();
            t3.start();
            System.out.println("Bye.........");
        }
    }
}