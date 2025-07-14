package oops;

public class eg_parameterized {
    public static void main(String[] args){
        Baby b1=new Baby("yuvasri",1);
        System.out.println(b1.name);
        System.out.println(b1.id);


    }
    static class Baby{
        String name;
        int id;

        Baby(String name,int id){
            this.id=id;
            this.name=name;


        }

    }
}
