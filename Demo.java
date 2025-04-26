
import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo{
    public static void main(String[] args) {
        // Collection does not support index values
        // Lists support index values

        // Collection<Integer> nums= new ArrayList<Integer>();
        // List<Integer> nums= new ArrayList<Integer>();
        // Set <Integer> nums= new HashSet<Integer>(); // Sets will eliminate the duplicates

        // If we want a set with sorted values we will use TreeSet()

        Set<Integer> nums= new TreeSet<Integer>();

        nums.add(6); // These values are not numbers they are object types so to use numbers we need to specify the datatype in 
        // angular brackets

        nums.add(7);
        nums.add(2);
        nums.add(1);
        nums.add(6); // Lists support multiple values
        // Sets do not have index values


        Iterator<Integer> values= nums.iterator(); 

        while(values.hasNext()){
            System.out.println(values.next());
        }
        // for(int i: nums){
        //     System.out.println(i);
        // }
        // System.out.println(nums.get(1));
        // System.out.println(nums); // We cannot directly print the original arrays but here it is possible
    }
}