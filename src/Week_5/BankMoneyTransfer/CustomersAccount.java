package Week_5.BankMoneyTransfer;

import java.util.HashMap;
import java.util.Map;

public class CustomersAccount {

    //customersAccount is defined to store  customers
    private HashMap<Customer,Double> customersAccount=new HashMap<>();
    public HashMap<Customer,Double> getCustomersAccount(){
        return this.customersAccount;
    }
    public void setCustomersAccount(HashMap<Customer, Double> customersAccount) {
        this.customersAccount = customersAccount;
    }
    //add new customers to list
    public void addNewCustomerInformation(Customer customer,double money){
        this.customersAccount.put(customer,money);
    }
    public  void deleteCustomerAccountInformation(Customer customer){
        for(Map.Entry<Customer,Double> entry: this.getCustomersAccount().entrySet()){
            if (entry.getKey().getTc().equals(customer.getTc())){
                this.customersAccount.remove(customer);
                break;
            }
        }
    }
    public void printCustomersAccountList(){
        int order=1;
        if(!customersAccount.isEmpty()){
            for (Map.Entry<Customer,Double> entry:customersAccount.entrySet()){
                System.out.println(order+"-"+entry.getKey().getName()+" "+entry.getKey().getSurName());
                order++;
            }
        }else{
            System.out.println("Don't  have any other acoount.");
        }
    }


}
