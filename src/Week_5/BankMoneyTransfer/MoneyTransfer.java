package Week_5.BankMoneyTransfer;

import ConstantOfSisterslab.ConstantOfInformation;

import java.util.Map;
import java.util.Scanner;

public class MoneyTransfer {
    public  static Scanner input=new Scanner(System.in);
    private  CustomersAccount customersAccount;
    MoneyTransfer(CustomersAccount customersAccount){
        this.customersAccount=customersAccount;

    }
    public CustomersAccount getCustomersAccount() {
        return customersAccount;
    }

    public void setCustomersAccount(CustomersAccount customersAccount) {
        this.customersAccount = customersAccount;
    }
    public  void sendMoneyToAccount(Customer customer,double money){
        customer.setAccount(customer.getAccount()+money);              //send money to your account
        printCustomerAccountInformation(customer);


    }
    public  void giveMoneyFromAccount(Customer customer,double money){
        if(customer.getAccount()>money){
            customer.setAccount(customer.getAccount()-money);                //take money from your account
            printCustomerAccountInformation(customer);
        }else{
            System.out.println(ConstantOfInformation.NOTHAVEMONEY.getValue());
        }
    }
    public void transferMoneyFromAccountToAnotherAccount(Customer customer1, Customer customer2, double money){
        if(customer1.getAccount()>money  && isCustomerToAccountList(customer2)){
            //if money enough and other person exist in list ,transfer money to other person
            customer1.setAccount(customer1.getAccount()-money);
            customer2.setAccount(customer2.getAccount()+money);
            printCustomerAccountInformation(customer1);

        }else{
            System.out.println(ConstantOfInformation.NOTHAVEMONEY.getValue());
        }

    }
    public boolean login(Customer customer){

        String name,password;
        System.out.println("### Log in to continue ###");
        System.out.print(ConstantOfInformation.ENTERNAME.getValue());
        name=input.next();
        System.out.print(ConstantOfInformation.ENTERPASSWORD.getValue());
        password=input.next();
        //login chase -> true
        return (customer.getName().equals(name) && customer.getPassword().equals(password));
    }
    public static void printCustomerAccountInformation(Customer customer){
        System.out.println(customer.getName()+" "+customer.getSurName()+" -> "+ConstantOfInformation.NOWYOUHAVE.getValue()+customer.getAccount()+ConstantOfInformation.MONEY.getValue());
    }
    public boolean isCustomerToAccountList(Customer customer){
        for (Map.Entry<Customer,Double> entry:customersAccount.getCustomersAccount().entrySet()){
            if(entry.getKey().getTc().equals(customer.getTc())){
                //customer on the list
                return true;
            }
        }
        return false;
    }

}
