
import java.util.Arrays;
import java.util.List;

public class Demo{
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,7,2,6,3);

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