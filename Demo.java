class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In a show");
    }
}

class B{
    
    @Override // Here we are telling the compiler that we want to override this method  
public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In B show");
    }
}

public class Demo{
    public static void main(String args[]){
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}