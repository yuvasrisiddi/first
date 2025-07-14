package static_keyword;

public class iib {
    public static void main(String[] args){
//
        new A();

    }
}
class A{




    static {
        System.out.println("static block");
    }
    {
        System.out.println("iib1");
    }
    {
        System.out.println("llb2");
    }

    A(){
        System.out.println("dc");
    }
}
