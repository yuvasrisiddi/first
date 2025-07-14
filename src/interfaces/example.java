package interfaces;

public class example {
    public static void main(String[] args){
        rectangle r1=new rectangle();
        r1.getarea(1,2);

        square s1=new square();
        s1.getarea(1,2);
    }

}


interface polygen{
    void getarea(int l,int b);
    default void complete(){
        System.out.println("possible");
    }
    static void staticcomplete(){
        System.out.println("static interface is allowed");
    }
}
class rectangle implements polygen{


    @Override
    public void getarea(int l, int b) {
        System.out.println("area:" +l*b);
    }
}
class square implements polygen{
    public void getarea(int l,int b){
        System.out.println("area "+ 3.14*l*b);
    }
}
