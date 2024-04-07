package Week_3;

import ConstantOfSisterslab.ConstantOfInformation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class OddOrEvenNumbers {
    public static  void takeNumber(int number,HashSet<Integer> evenList,ArrayList<Integer> oddList){

        if(number%2==0){
            addEvenNumber(number,evenList);
        }else{
            addOddNumber(number,oddList);
        }
        print(evenList,oddList);

    }
    public static void print(HashSet<Integer> evenList,ArrayList<Integer> oddList){
        System.out.println(ConstantOfInformation.EVENLIST.getValue()+evenList);
        System.out.println(ConstantOfInformation.ADDLIST.getValue()+oddList);
    }
    public static void addEvenNumber(int number,HashSet<Integer> evenList){
        evenList.add(number);
    }
    public static void addOddNumber(int number, ArrayList<Integer> addList){
        addList.add(number);
    }

    public static void main(String[] args) {
        boolean condition=true;
        int number;

        HashSet<Integer> evenList=new HashSet<>();
        ArrayList<Integer> oddList=new ArrayList<>();

        Scanner input=new Scanner(System.in);

        while(condition){
            System.out.print(ConstantOfInformation.DOYOUWANTTOADD.getValue());
            condition=input.nextBoolean();
            if(!condition){
                System.out.println(ConstantOfInformation.SEEYOULATER.getValue());
                break;
            }
            System.out.print(ConstantOfInformation.ENTERYOURNUMBER.getValue());
            number=input.nextInt();
            takeNumber(number,evenList,oddList);
        }
    }
}
