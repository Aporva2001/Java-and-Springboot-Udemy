// // we can also define a class inside another class it is called the inner class
// // we use inner class when we have no other use of the inner class than to use the properties of the outer class
// class A{
//     int age;
//     public void show(){
//         System.out.println("In show");
//     }

//    static class B{
//         public void config(){
//             System.out.println("Inside the method config");
//         }
//     }
// }

class A{
    public void show(){
        System.out.println("In A show");
    }
}
public class Demo{
    public static void main(String[] args) {
    //     A obj= new A();
    //     obj.show();

    //     // A.B obj1= obj.new B(); // Creating the object of an inner class B
    //     A.B obj1= new A.B();
    //     obj1.config();

    // If we want to override the behaviour of show and provide it with a different implementation then
    A obj= new A(){ // This is called the anonymous class.
        public void show(){
        System.out.println("In new show");
    }
    };
    obj.show();

    }
}