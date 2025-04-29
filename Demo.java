import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;


class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("age=").append(age);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }

    public int compareTo(Student that) {
        if(this.age > that.age)
        return 1;
        else
            return -1;
    }


}
public class Demo{
    public static void main(String[] args) {

        // Comparator<Integer> com = new Comparator<Integer>(){ // Comparator is an interface so we will use anonymous class here
        // // In case of anonymous class it is necessary to specify the datatypes on both the sides
        // public int compare(Integer i,Integer j ){
        //     if(i%10 > j%10)
        //     return 1; // It will swap
        //     else
        //     return -1; // It will not swap
        // }

        // };

        Comparator<Student> compstud= (Student s1, Student s2) -> {
                if(s1.age > s2.age)
                    return 1;
                else
                    return -1;
            }  

        Comparator<String> compstr=  new Comparator<String>(){

            public int compare(String s1, String s2){
                if(s1.length() < s2.length())
                    return 1;
                else
                    return -1;

            }
        };
        // List<Integer> nums = new ArrayList<>(); // If we specify the datatype in one angular bracket, there is no need to specify it in another
        // nums.add(43);
        // nums.add(31);
        // nums.add(72);
        // nums.add(29);    

        List<Student> studs= new ArrayList<>();

        studs.add(new Student(21, "Rohan"));
        studs.add(new Student(22, "Rahul"));
        studs.add(new Student(23, "Sara"));
        studs.add(new Student(20, "Samuel"));
        studs.add(new Student(18, "James"));

        // for(Student s: studs){
        //     System.out.println(s.toString());
        // }

        List<String> strs= new ArrayList<>();

        strs.add("Hello");
        strs.add("this");
        strs.add("is");
        strs.add("Aporva");
        strs.add("Learning");
        strs.add("Java");
        
        // System.out.println(strs);
        Collections.sort(strs, compstr);
        // System.out.println(strs);
        // Collections.sort(nums,com);
        // Collections.sort(nums);

        // Collections.sort(studs, compstud);// Here if we dont want to specify the comparator then we have to implement comparable 
        // interface in Student class and implement its compareTo method
        Collections.sort(studs);

        for(Student s: studs){
            System.out.println(s.toString());
        }
        
        // System.out.println(nums);

    }
}