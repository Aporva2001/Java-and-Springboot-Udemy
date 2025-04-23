public class Demo{

    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Aporva"); // StringBuffer or StringBuilders are used to create mutable strings in java.

        // System.err.println(sb.capacity()); //By default the capacity of the string is 16
        // 16 size is provided by default in stringBuffer because if contigous allocation is done, then there may the problem associated with the size available, so to avoid that a buffer is provided.
        sb.append(" Goyal");
        sb.deleteCharAt(0);
        sb.insert(0,"Java");
        System.err.println(sb);
    }
}