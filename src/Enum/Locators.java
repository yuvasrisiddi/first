package Enum;

public enum Locators {
    page_email("#username"),
    page_password("#password"),
    pagebtn("#btn");

    private String locators;
    Locators (String locators){
        this.locators=locators;
    }
    String getLocators(){
        return this.locators;
    }
}
