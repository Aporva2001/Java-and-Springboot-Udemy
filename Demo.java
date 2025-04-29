
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo{
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,7,2,6,3);

        Stream<Integer> s1= nums.stream(); // It returns a stream of numbers and using it we can perform any operation without 
        // affecting nums

        Stream<Integer> s2= s1.filter(n -> n%2 == 0);

        Stream<Integer> s3= s2.map(n -> n*2);

        int result = s3.reduce(0, (c,e) -> c+e);

        System.out.println(result);

        int res= nums.stream()
        .filter(n -> n%2 == 0)
        .map(n -> n*2)
        .reduce(0, (c,e)-> c+e);

        System.out.println(res);


        // s3.forEach(n -> System.out.println(n));

        // s2.forEach(n -> System.out.println(n));

        // nums.forEach(val -> System.out.println(val));
        // s1.forEach(val -> System.out.println(val));
        
        // we can use stream only once
        // s1.forEach(val -> System.out.println(val)); // This will throw an error

        
    }
}