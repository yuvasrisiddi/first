package Enum;

public enum colours {
    RED("#FF0000"),
    GREEN("#61FF33");
    private String hexcode;
    colours (String hexcode){
        this.hexcode=hexcode;
    }
    String getHexcode(){
        return this.hexcode;
    }


}
