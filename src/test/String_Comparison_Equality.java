package test;

public class String_Comparison_Equality {
    public static void main(String[] args){
        String s1="Hello";
        String s2= "hello";
        String s3= "Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));

    }
}
