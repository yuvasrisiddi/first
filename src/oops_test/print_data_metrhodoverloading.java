package oops_test;

public class print_data_metrhodoverloading {
    public static void main(String [] args){
        printer mpd=new printer();
        int mp=mpd.multiple_printData(1,2);
        float mp1=mpd.multiple_printData(12.9f,3.5f);
        String mp2=mpd.multiple_printData("yuvasri");
        System.out.println(mp);
        System.out.println(mp1);
        System.out.println(mp2);




    }
}
class printer{
    int multiple_printData(int a,int b){
        System.out.println("int data");
        return a+b;
    }
    float multiple_printData(float a,float b){
        System.out.println("float data");
        return a-b;
    }
    String multiple_printData(String a){
        System.out.println("String data");
        return a;
    }

}
