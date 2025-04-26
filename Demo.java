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
       Thread t1= new Thread(obj1); // NEW state
        Thread t2= new Thread(obj2);
        t1.start(); // RUNNABLE state
        // when the thread is executing run() it is in RUNNING STATE
        t2.start();

        // join method allows the threads to complete and join the main thread

        // sleep() and wait() changes the state of thread to  WAITING state, now if we want to rerun our thread we have to
        // use notify() method and this method will convert the state of the thread from waiting state to runnable state

        // if we want a thread to goto dead state we use stop() method, IT IS NOT GOOD PRACTICE AS IT CAUSES INCONSISTENCIES
        // IN OUR SYSTEM
        
        t1.join();
        t2.join();
        
        System.out.println(c.count); // Here the main thread is not waiting for the t1 and t2 threads to wait for them to finish

       }    
    }