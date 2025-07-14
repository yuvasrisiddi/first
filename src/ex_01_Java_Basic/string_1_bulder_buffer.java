package ex_01_Java_Basic;

public class string_1_bulder_buffer {
    public static void main(String[] args){
//        StringBuilder bulider=new StringBuilder("yuvasri");
//        bulider.append("dimpu");
//        System.out.println(bulider);
//        System.out.println(bulider.reverse());

//        StringBuffer bulider=new StringBuffer("yuvasri");
//        bulider.append("dimpu");
//        System.out.println(bulider);
//        bulider.delete(7,12);
//        System.out.println(bulider);
//        bulider.replace(0,7,"c++");
//        System.out.println(bulider);

        StringBuffer s=new StringBuffer("yuva");
        s.insert(4,"sri");
        System.out.println(s);

        s.replace(2,4,"dim");
        System.out.println(s);





    }
}
