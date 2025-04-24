enum Status{
    Running, Failed, Success,Pending;
}

class Demo{
    public static void main(String[] args) {
        // Status s= Status.Running;
        // If we want to get all the values then we will use values() method
        Status ss[] = Status.values();
        // System.out.println(ss[1]);

        for(Status s : ss){
            System.out.println(s);
        }
        // System.out.println(s);
        // System.out.println(s.ordinal()); // This method returns a  number associated with an enum item

    }
}