package Week_5.BankMoneyTransfer;

import ConstantOfSisterslab.ConstantOfInformation;

import java.util.Map;
public class BankMoneyTransfer {
    public  MoneyTransfer moneyTransfer;
    public  CustomersAccount customersAccount;
    public  Customer customer;
    BankMoneyTransfer(Customer customer,CustomersAccount customersAccount){
        this.customer=customer;
        this.moneyTransfer=new MoneyTransfer(customersAccount);
        this.customersAccount =customersAccount;
    }

    public String menu="---------\n1- Send money to my account\n2- Transfer money\n3- Give money\n4- Change password\n5- Log out!\n---------";
    public void run(){
        int choice;
        boolean condition=true;
        System.out.println(ConstantOfInformation.WELCOME.getValue()+customer.getName()+" "+customer.getSurName());
        //check login condition
        if(moneyTransfer.login(customer)){
            System.out.println(ConstantOfInformation.LOGIN.getValue());
            //start bank simulation
            while (condition){
                System.out.println(menu);
                try{
                    System.out.print(ConstantOfInformation.ENTERYOURCHOICE.getValue());
                    choice=MoneyTransfer.input.nextInt();
                    //log out condition
                    if (choice==5){
                        System.out.println(ConstantOfInformation.SEEYOULATER.getValue());
                        break;
                    }else if(choice>=1 && choice<=4){
                        //go choice and start process
                        runChoice(choice);

                    }
                }catch (Exception e){
                    condition=false;
                    System.out.println(ConstantOfInformation.SOMETHINGWRONGTRYAGAIN.getValue());
                }
            }
        }else{
            System.out.println(ConstantOfInformation.LOGINFAILED.getValue());
        }


    }
    public void runChoice(int choice){
        Customer customer1=new Customer();

        switch (choice){

            case 1:
                //send money to your account
                System.out.print(ConstantOfInformation.ENTERMONEY.getValue());
                moneyTransfer.sendMoneyToAccount(customer,MoneyTransfer.input.nextDouble());
                break;
            case 2:
                //send money to another person
                System.out.print(ConstantOfInformation.PERSONNAME.getValue());
                String name=MoneyTransfer.input.next();
                for (Map.Entry<Customer,Double> entry: customersAccount.getCustomersAccount().entrySet()){
                    //chech person on list
                    if(entry.getKey().getName().equalsIgnoreCase(name)){
                        customer1 = entry.getKey();
                        break;
                    }
                }
                //take money  and go money transfer method
                System.out.print(ConstantOfInformation.ENTERMONEY.getValue());
                moneyTransfer.transferMoneyFromAccountToAnotherAccount(customer,customer1,MoneyTransfer.input.nextDouble());
                break;
            case 3:
                //take money from your account
                System.out.print(ConstantOfInformation.ENTERMONEY.getValue());
                moneyTransfer.giveMoneyFromAccount(customer,MoneyTransfer.input.nextDouble());
                break;
            case 4:
                //change password
                System.out.print(ConstantOfInformation.ENTERPASSWORD.getValue());
                this.customer.setPassword(MoneyTransfer.input.next());
                break;
        }

    }
}
