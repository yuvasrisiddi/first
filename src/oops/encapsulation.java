package oops;

public class encapsulation {
    public  static void main(String[] args){
        icicbank ib=new icicbank("yuvasri",100000);
        long bal=ib.getBal();
        System.out.println(bal);

        long bal1=ib.setBal(300,true);
        System.out.println(bal1);










    }
}
class icicbank{

    private String name;
    private long bal;

    public icicbank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public long setBal(long bal, boolean cashier) {
        if(cashier){
            this.bal = bal;
        }
       else{
           System.out.println("not allowed");
        }
        return bal;
    }


}
