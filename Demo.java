
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo{
    public static void main(String[] args) {
        // Collection does not support index values
        // Lists support index values

        // Collection<Integer> nums= new ArrayList<Integer>();
        List<Integer> nums= new ArrayList<Integer>();
        nums.add(6); // These values are not numbers they are object types so to use numbers we need to specify the datatype in 
        // angular brackets

        nums.add(7);
        nums.add(2);
        nums.add(1);

        // for(int i: nums){
        //     System.out.println(i);
        // }
        System.out.println(nums.get(1));
        // System.out.println(nums); // We cannot directly print the original arrays but here it is possible
    }
}