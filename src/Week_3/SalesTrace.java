package Week_3;

import ConstantOfSisterslab.ConstantOfInformation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesTrace {
    public static void runSalesTrace(int selection, String name, double money, HashMap<String,Double> list){
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
        System.out.println(ConstantOfInformation.COMPANYADDED.getValue());
    }
    public static void deleteCompanyToList(String name,Double money,HashMap<String,Double> list){
        if(list.containsKey(name) && list.containsValue(money)){
            list.remove(name,money);
            System.out.println(ConstantOfInformation.COMPANYDELETED.getValue());
        }else{
            System.out.println(ConstantOfInformation.COMPANYNOTFOUND.getValue());
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
            System.out.println(ConstantOfInformation.TOTALAMOUNTOFSALES.getValue()+total);
        }
        if (selection==4){
            printMaxAmountOfCompany(maxMoney,list);
        }
    }
    public  static void printCompanies(HashMap<String,Double> list){
        System.out.println("---------Companies---------");
        for(Map.Entry<String,Double> entry : list.entrySet()){
            System.out.println(entry.getKey()+ConstantOfInformation.ARROW.getValue()+entry.getValue());
        }

    }
    public  static void printMaxAmountOfCompany(double maxMoney,HashMap<String,Double> list){
        for(Map.Entry<String,Double> entry : list.entrySet()){
            if(entry.getValue()==maxMoney){
                System.out.println(entry.getKey()+ConstantOfInformation.MAKESAMOUNTOFSALES.getValue()
                        + ConstantOfInformation.LEFTPARANTHES.getValue()
                        +maxMoney+ConstantOfInformation.RIGHTPARANTHES.getValue());
            }
        }
    }
    public static void main(String[] args) {
        int selection;
        String companyName=ConstantOfInformation.SPACE.getValue();
        double money=0;
        HashMap<String,Double> list=new HashMap<>();
        Scanner input=new Scanner(System.in);
        String menu="1-Add Company\n2-Delete Company\n3-Give Total Amount Of Sales\n4-Top Selling Company\n5-Companies List\n6-Log Out!";

        while (true){
            System.out.println(menu);
            System.out.print(ConstantOfInformation.ENTERYOURSELECTION.getValue());
            selection=input.nextInt();
            System.out.println("------------------");

            if(selection>=6 || selection<=0){                               // log out system
                System.out.println(ConstantOfInformation.SEEYOULATER.getValue());
                break;
            }
            if(selection<=2 ){                                              // add and delete
                System.out.print(ConstantOfInformation.ENTERYOURCOMPANYNAME.getValue());
                companyName=input.next();
                System.out.print(ConstantOfInformation.ENTERYOURMONEY.getValue());
                money=input.nextInt();

            }
            runSalesTrace(selection,companyName,money,list);
            System.out.println("---------New Process---------");


        }

    }
}
