

abstract class A{
    public abstract void  show();
    public abstract void config();
}
// class B extends A{
//     public void show(){
//         System.out.println("In B show ");
//     }
// }
// Since we have to use the method only one time so we can use anonymous functions

public class Demo{
    public static void main(String[] args) {
        A obj = new A(){ // Here we are not creating the object of class A but we are creating an object of inner class A
            public void show(){
        System.out.println("In new show ");
    }
        public void config(){
            System.out.println("This is config");
        }
    };
        obj.show();
        obj.config();
    }
}