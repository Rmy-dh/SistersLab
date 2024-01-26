package Week_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesTracke {
    public static void runSalesTracke(int selection,String name,double money,HashMap<String,Double> list){
        switch (selection){
            case 1:
                addCompanyToList(name,money,list);
                break;
            case 2:
                deleteCompanyToList(name,money,list);
                break;
            case 3:
            case 4:
                getTotalAmountOfSales(selection,list);
                break;
            case 5:
                printCompanies(list);
                break;

        }

    }
    public static void addCompanyToList(String name,Double money,HashMap<String,Double> list){
        list.put(name,money);
        System.out.println("Company added.");
    }
    public static void deleteCompanyToList(String name,Double money,HashMap<String,Double> list){
        if(list.containsKey(name) && list.containsValue(money)){
            list.remove(name,money);
            System.out.println("Company deleted.");
        }else{
            System.out.println("The company not found!");
        }
    }
    public static void getTotalAmountOfSales(int selection,HashMap<String,Double> list){
        double total=0.0;
        double maxMoney=0.0;
        for(Double money:list.values()){
            total+=money;
            if(maxMoney<money){
                maxMoney=money;
            }
        }
        if(selection==3){
            System.out.println("Total amount of sales -> "+total);
        }
        if (selection==4){
            printMaxAmountOfCompany(maxMoney,list);
        }
    }
    public  static void printCompanies(HashMap<String,Double> list){
        System.out.println("---------Companies---------");
        for(Map.Entry<String,Double> entry : list.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

    }
    public  static void printMaxAmountOfCompany(double maxMoney,HashMap<String,Double> list){
        for(Map.Entry<String,Double> entry : list.entrySet()){
            if(entry.getValue()==maxMoney){
                System.out.println(entry.getKey()+" makes max amount of sales"+ " ("+maxMoney+")");
            }
        }
    }
    public static void main(String[] args) {
        int selection;
        String companyName="";
        double money=0;
        HashMap<String,Double> list=new HashMap<>();
        Scanner input=new Scanner(System.in);
        String menu="1-Add Company\n2-Delete Company\n3-Give Total Amount Of Sales\n4-Top Selling Company\n5-Companies List\n6-Log Out!";

        while (true){
            System.out.println(menu);
            System.out.print("Enter your selection: ");
            selection=input.nextInt();
            System.out.println("------------------");

            if(selection>=6 || selection<=0){                               // log out system
                System.out.println("See you later!");
                break;
            }
            if(selection<=2 ){                                              // add and delete
                System.out.print("Enter your company name: ");
                companyName=input.next();
                System.out.print("Enter your money :");
                money=input.nextInt();

            }
            runSalesTracke(selection,companyName,money,list);
            System.out.println("---------New Process---------");


        }

    }
}
