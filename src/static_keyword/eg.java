package static_keyword;

public class eg {
    public static void main(String[] args){
        p p1=new p();
        System.out.println(p.a);
        p1.a=12;
        System.out.println(p1.a);


    }
}
class p{
    static int a=10;
    static {
        System.out.println("class loaded");
    }
}
