class A extends Thread // Now this class is not an ordinary class it is a thread
 {
    public void run(){

        for(int i=1;i<=10;i++)
        System.out.println("Hi");
    }
}

class B extends Thread{
    public void run(){

        for(int i=1;i<=10;i++)
        System.out.println("Hello");
    }
}

public class Demo{
    public static void main(String args[]){
        A obj1= new A();
        B obj2= new B();

        obj1.start(); // We need to give start if we want to implement threads and the method name will be run()
        obj2.start();
       }
    }