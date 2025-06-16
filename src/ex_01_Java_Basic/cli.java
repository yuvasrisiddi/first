package ex_01_Java_Basic;

public class cli {
    public static void main(String[] args){
        String age_string=args[0];

        int age=Integer.parseInt(age_string);
        String result=(age>18) ? "yes":"no";
        System.out.println(result);

    }
}
