
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo{
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,7,2,6,3);

        // forEach accepts a Consumer object, where Consumer is an interface

        Consumer<Integer> con= new Consumer<Integer>(){
            
            public void accept(Integer n){
                System.out.println(n);
            }
        };
        

        // int sum=0;
        // for(int n: nums){
        //     if(n%2 == 0)
        //     {
        //         n=n*2;
        //         sum +=  n;
        //     }
        // }

        // for(int i=0;i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }

        nums.forEach(val -> System.out.println(val));

        // System.out.println(sum);
    }
}