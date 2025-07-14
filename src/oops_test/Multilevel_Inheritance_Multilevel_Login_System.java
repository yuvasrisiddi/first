package oops_test;

public class Multilevel_Inheritance_Multilevel_Login_System {
    public static void main(String[] args){
        SuperAdmin s1=new SuperAdmin();
        s1.u_name();
        s1.p_word();
        s1.AdminUser();
        s1.shutdownSystem();
    }



}

class AdminUser  {
    void AdminUser(){
        System.out.println("login the user");
    }
}

class AdminPanel extends AdminUser{
    void u_name(){
        System.out.println("yuvasri");
    }
    void p_word(){
        System.out.println("Yuva@123");
    }


}
class SuperAdmin  extends AdminPanel{
    void shutdownSystem(){
        System.out.println("please shout down the system");
    }
}
