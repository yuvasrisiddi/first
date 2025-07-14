package oops.hiearchial_inheritence;

public class hiearchial {
    public static void main(String[] args){
        father f1=new father();
        f1.home();
        System.out.println("-----");

        son s1=new son();
        s1.car();
        s1.home();
        System.out.println("--------");

        daughter d1=new daughter();
        d1.clge();
        d1.home();



    }
//     static class father{
//        void home(){
//            System.out.println("1bhk");
//        }
//    }
//    static class son extends father{
//        void car(){
//            System.out.println("car");
//        }
//    }
//    static class daughter extends father{
//        void clge(){
//            System.out.println("svu");
//        }
//    }


}
class father{
    void home(){
        System.out.println("1bhk");
    }
}
class son extends father{
    void car(){
        System.out.println("car");
    }
}
class daughter extends father{
    void clge(){
        System.out.println("svu");
    }
}
