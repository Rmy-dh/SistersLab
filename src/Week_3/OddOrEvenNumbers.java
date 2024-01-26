package Week_3;

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
        System.out.println("Even List-> "+evenList);
        System.out.println("Add List-> "+oddList);
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
            System.out.print("Do you want to add number to Array, please write true or false:  ");
            condition=input.nextBoolean();
            if(!condition){
                System.out.println("See you later.");
                break;
            }
            System.out.print("Enter your number :");
            number=input.nextInt();
            takeNumber(number,evenList,oddList);
        }
    }
}
