package oops.multilevel_inheritance;

public class object_creation {
    public static void main(String[] args){
        grandfather gf=new grandfather();
        gf.gold();
        gf.home();
        System.out.println("---------");

        father f1=new father();
        f1.bhk1();
        f1.silver();
        System.out.println("-------");

        son s1=new son();
        s1.bhk3();
        s1.car();

        System.out.println("----------");

        grandfather g1=new son();
        g1.home();
        g1.gold();
        System.out.println("dynamic dispatch concept");


    }
}
