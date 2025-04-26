
import com.sun.jdi.event.ThreadStartEvent;

class A extends Thread // Now this class is not an ordinary class it is a thread
 {
    public void run(){

        for(int i=1;i<=10;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(10); // If we are specifying this then we are asking our thread to wait for the number of milliseconds
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){

        for(int i=1;i<=10;i++){
        System.out.println("Hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        }
    }
}

public class Demo{
    public static void main(String args[]){
        A obj1= new A();
        B obj2= new B();

        obj2.setPriority(Thread.MAX_PRIORITY); // This is the constant which has the value 10
        obj1.start(); // We need to give start if we want to implement threads and the method name will be run()
        try {
            Thread.sleep(2);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        obj2.start();
         // This method is used to give the priority of the threads
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

       }    
    }