package Super_keyword;

public class Super {
    public static void main(String[] args){
        animal cat=new animal();
        cat.sound();


    }
}
class god{
    public int gold=100;
    void sound(){
        System.out.println("God!!");
    }
    god(){
        System.out.println("yuva");
    }


}
class animal extends god{

//    @Override
    void sound(){
       super.sound();
    }
    animal(){
        super();
    }
    void test() {
        System.out.println(super.gold);

    }

}
