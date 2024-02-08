package Week_5.BankMoneyTransfer;
public class BankMoneyTransferSimulaton {
    public static void main(String[] args) {
        //create new customers
        Customer customer1=new Customer("Ali","Yılmaz","11111111111","560",100.2);
        Customer customer=new Customer("Kader","Temmuz","22222222222","861",10.2);
        Customer customer2=new Customer("Ceren","Yağmur","33333333333","856",12.6);

        //add customers to customerAccount list
        CustomersAccount customersAccount=new CustomersAccount();
        customersAccount.addNewCustomerInformation(customer,customer.getAccount());
        customersAccount.addNewCustomerInformation(customer1,customer1.getAccount());
        customersAccount.addNewCustomerInformation(customer2,customer2.getAccount());

        //start your simulation
        BankMoneyTransfer newBankSimulation=new BankMoneyTransfer(customer,customersAccount);
        newBankSimulation.run();

    }
}
