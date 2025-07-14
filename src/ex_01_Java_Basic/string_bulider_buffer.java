package ex_01_Java_Basic;

public class string_bulider_buffer {
    public static void main(String[] args){
        String s1="yuvasri";
        String s2=new String("yuvasri");

        StringBuilder bulider=new StringBuilder("yuvasri");
        StringBuffer buffer=new StringBuffer("yuvasri");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(bulider);
        System.out.println(buffer);
    }
}
