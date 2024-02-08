package ConstantOfSisterslab;

public enum ConstantOfInformation {
    NOTHAVEMONEY("You don't have enough money."),
    NOWYOUHAVE("Now, you have : "),
    LOGIN("Login Successfully"),
    ENTERYOURCHOICE("Enter your choice: "),
    LOGINFAILED("Login Failed"),
    SEEYOULATER("See you later!"),
    ENTERMONEY("Enter your amount of money: "),
    PERSONNAME("Person Name: "),
    ENTERPASSWORD("Enter your password: "),
    ENTERNAME("Enter your name: "),
    WELCOME("Welcome "),
    SOMETHINGWRONGTRYAGAIN("Something wrong ,try again."),
    MONEY(" money");
    private final String value;
     ConstantOfInformation(String value){
        this.value=value;
    }
    public String getValue(){
        return this.value;
    }

}
