package Enum;

public enum URL {
    vwo("https://vwo.com/"),
    google("https://www.google.com/");

    private String url;
    URL(String url){
        this.url=url;
    }
    String getUrl(){
        return this.url;
    }
}
