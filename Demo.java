
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Demo{
    public static void main(String[] args) {
        // Map<String,Integer> students= new HashMap<>();
    Map<String,Integer> students= new Hashtable<>();

    // Hashtable is synchronised whereas HashMap is not
    
        students.put("Asd",56);
        students.put("Asdf",55);
        students.put("Agd",14);
        students.put("sdf",78);
        students.put("Agd",45);
        // Keys are unique

        // students.add() means we are adding a new element
        // students.put() means if we dont have the element add it otherwise update it

        System.out.println(students);

        // To get all the keys
        System.out.println(students.keySet());
        // System.out.println(students.get("Asd"));

        for(String key: students.keySet()){
            System.out.println(key + " " + students.get(key));
        }
    }
}