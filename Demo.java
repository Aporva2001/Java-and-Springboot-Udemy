@FunctionalInterface
interface  A{
    int add(int i, int j);
}

public class Demo{
    public static void main(String args[]){
        A obj = ( i, j) ->   i+j; // if we have one return value then we dont need to add the return statement the return value will be the type of i+j

        int result= obj.add(5,4);
        System.out.println(result);
       }
    }