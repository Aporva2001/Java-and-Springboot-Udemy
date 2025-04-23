interface A{
    // All the variables inside interface are final and static

    int age=23;
    String area="Mumbai";

    void show();
    void config();
    // even if we dont mention methods to be abstract they are public abstract by default in an interface.
}

class B implements A{
    public void show(){
        System.out.println("In show");
    }

    public void config(){
        System.out.println("In config");
    }
}
public class Demo{
    public static void main(String[] args) {
       A obj;
    //    obj= new A();
    obj = new B();
    obj.show();
    obj.config();
    System.out.println(A);
    }
}