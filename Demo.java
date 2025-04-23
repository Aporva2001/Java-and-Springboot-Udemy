interface A{
    // All the variables inside interface are final and static

    int age=23;
    String area="Mumbai";

    void show();
    void config();
    // even if we dont mention methods to be abstract they are public abstract by default in an interface.
}
interface X{

    void run();
}

interface Y extends X{

}
class B implements A,Y{
    public void show(){
        System.out.println("In show");
    }

    public void config(){
        System.out.println("In config");
    }

    public void run(){
        System.out.println("Running..");
    }
}
public class Demo{
    public static void main(String[] args) {
       A obj;
    //    obj= new A();
    obj = new B();
    obj.show();
    obj.config();

    // obj.run(); //error
    X obj1;
    obj1= new B();
    obj1.run();
    // System.out.println(A);
    }
}