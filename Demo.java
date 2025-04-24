@FunctionalInterface
interface  A{
    void show(int i);
    // void run();
}

// class B implements  A{
//     public void show(){
//         System.out.println("In show");
//     }
// }
public class Demo{
    public static void main(String args[]){
       A obj= i -> 
    //    {   // -> means that it is a lamda expression

                System.out.println("In show");
            // };
       obj.show(5);
       }
    }