class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class Demo{
    public static void main(String args[]) throws InterruptedException{
        Counter c= new Counter();

        Runnable obj1= () -> {
        for(int i=1;i<=10000;i++)
        {
            c.increment();
        }
    };
        Runnable obj2= () -> {
        for(int i=1;i<=10000;i++)
        {
            c.increment();
        }
    };
       Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);
        t1.start();
        t2.start();

        // join method allows the threads to complete and join the main thread
        t1.join();
        t2.join();
        
        System.out.println(c.count); // Here the main thread is not waiting for the t1 and t2 threads to wait for them to finish

       }    
    }