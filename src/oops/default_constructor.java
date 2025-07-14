package oops;

public class default_constructor {

    public static void main(String[] args){
        Baby b=new Baby();


    }

     static class Baby{
        String name;

        Baby(){
            System.out.println("default constructor");
        }
    }
//    static void cry(){
//        System.out.println("cry!");
//    }
}
