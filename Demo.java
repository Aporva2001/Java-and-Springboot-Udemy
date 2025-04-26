
// class A implements  Runnable 
//  {
//     public void run(){

//         for(int i=1;i<=5;i++)
//         {
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10); 
//                             } catch (InterruptedException ex) {
//                 ex.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable{
//     public void run(){

//         for(int i=1;i<=10;i++){
//         System.out.println("Hello");
//         try {
//             Thread.sleep(10);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         }
//     }
// }

public class Demo{
    public static void main(String args[]){
        // A obj1= new A();
        // B obj2= new B();
        // Runnable obj1= new A();
        Runnable obj1= () -> {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(10); 
                            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    };
        // Runnable obj2= new B();
        Runnable obj2= () -> {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10); 
                            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    };

        // The runnable interface does not have methods of the thread class so we have to create seperate threads and use the methods

        // obj2.start(); // Here start will not work as it is the part of Thread class so to solve this problem,
        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);
        t1.start();
        t2.start();
       }    
    }