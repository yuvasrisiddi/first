package oops.single_inheritence;

public class example {
    public static void main(String[] args){
        father f1=new father();
        System.out.println(f1.gold);
        f1.bhk2();
        System.out.println("-------------");

        son s1=new son();
        s1.bhk3();
        s1.bhk2();
        System.out.println(s1.gold);



    }

    static class father {
        int gold=1000;

        void bhk2(){
            System.out.println("father-2bhk");
        }

    }
    static class son extends father{

        void bhk3(){
            System.out.println("son-3bhk");
        }
    }
}
