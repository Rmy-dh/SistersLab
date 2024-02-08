package Week_5.BankMoneyTransfer;


public class Customer {
    private String name;
    private String surName;
    private String tc;
    private String password;
    private double account;
    Customer(){

    }
    Customer(String name,String surName,String tc,String password,double account){
        this.name=name;
        this.surName=surName;
        this.tc=tc;
        this.password=password;
        this.account=account;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccount() {
        return account;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public String getSurName(){
        return this.surName;
    }
    public String getPassword(){
        return this.password;
    }
    public String getTc(){
        return this.tc;
    }


}
