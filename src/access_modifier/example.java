package access_modifier;

public class example {

    public static void main(String[] args){
        yuva y=new yuva("yuvasri");
        System.out.println(y.name);


    }



}

class yuva{

    public String name;
    yuva(String name){
        this.name=name;

    }
}


