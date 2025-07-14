package access_modifier;

public class public_private {

}
class father{
    private String name;
    int salary;
    public int age;

    void father(){
        String name="yuva";
        System.out.println(name);
    }

}
class son extends father{
    void son(){
        System.out.println(age);
        System.out.println(salary);
    }
}
