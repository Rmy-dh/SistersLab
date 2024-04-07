package Week_5;

import ConstantOfSisterslab.ConstantOfInformation;

import java.util.Scanner;

public class ReverseInteger {
    public static void findReverseNumber(int number){
        int reverseNumber=0,value;
        while(number != 0){
            value=number%10;                                    //value is last character of value
            reverseNumber = 10*reverseNumber+value;
            number/=10;
        }
        System.out.println(reverseNumber);

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print(ConstantOfInformation.X.getValue());
        int x=input.nextInt();
        findReverseNumber(x);          //Get x value
    }
}
