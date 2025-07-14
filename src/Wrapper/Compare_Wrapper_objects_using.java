package Wrapper;

public class Compare_Wrapper_objects_using {
    public static void main(String[] args){
        Integer a=10;
        Integer b=10;

        Integer c=new Integer(20);
        Integer d=new Integer(25);
        System.out.println(a==b); //true
        System.out.println(c==d); //false
        System.out.println(a.equals(b)); //true
        System.out.println(c.equals(d)); //false

    }
}
