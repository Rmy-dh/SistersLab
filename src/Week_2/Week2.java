package Week_2;

import java.util.Scanner;

public class Week2 {
    /*

    //--------------------------------------First Question-------------------------------------------
    static int getFibonacci(int number){
        if(number==1 || number ==2){
            return 1;
        }
        return getFibonacci(number-1)+getFibonacci(number-2);
    }
    public static void main(String[] args) {

        //Enter your limit for fibonacci: 11
        //Series-> 1 1 2 3 5 8 13 21 34 55 89

        Scanner input=new Scanner(System.in);
        System.out.print("Enter your limit for fibonacci: ");
        int number=input.nextInt();
        System.out.print("Series-> ");
        for(int i=1;i<=number;i++){
            System.out.print(getFibonacci(i)+" ");
        }

    }
    //--------------------------------------Second Question-------------------------------------------

    static  boolean isPalindromNumber(int number){
        int reverseNumber=0, temp=number, rest=0;
        while (temp !=0){
            rest=temp % 10;
            reverseNumber=(reverseNumber*10)+rest;
            temp/=10;
        }
        return reverseNumber==number;
    }
    static boolean isPalindromSentence(String sentence){
        String [] list=sentence.split("");
        String reverseSentence="";
        for(int i=list.length-1;i>=0;i--){
            reverseSentence+=list[i];
        }
        return reverseSentence.equals(sentence);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number=input.nextInt();
        System.out.print("Enter your sentence: ");
        String sentence=input.next();
        if(isPalindromNumber(number)){
            System.out.println(number+" is a palindrom number. ");           //check palindrom number
        }else{
            System.out.println(number+" is not a polindrom number.  ");
                                                                               //check palindrom sentence
        }
        String condition=isPalindromSentence(sentence)? " is a palindrom sentence. ":" is  not a palindrom sentence. ";

        System.out.println(sentence+ condition);
    }


    //--------------------------------------Third Question-------------------------------------------
    static void getPermutation(int number1,int number2){
        int answer=0;
        if((number1-number2)>0){
            answer=findFactorial(number1)/(findFactorial(number1-number2));
            System.out.println("Permutation of numbers are: "+answer);
        }else{
            System.out.println("Not correct permutation");
        }
    }
    static int findFactorial(int number){
        int answer=1;
        for(int i=1;i<=number;i++){
            answer*=i;
        }
        return answer;
    }
    public static void main(String[] args) {
        //n!/(n-r)!
        //(5,3)=60
        int number1,number2;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number: ");
        number1=input.nextInt();
        System.out.print("Enter second number: ");
        number2=input.nextInt();
        getPermutation(number1,number2);

    }


    //--------------------------------------Fourth Question-------------------------------------------
     static boolean isPrime(int number){
        for(int i=2;i<number;i++){
            if(number%i==0 ){
                return false;
            }
        }
        return true;           // number=2 value  returns true
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        int number=input.nextInt();
        if(isPrime(number)){
            System.out.println(number+" is a prime number.");
        }else{
            System.out.println(number+" is not a prime number.");
        }
    }


    //--------------------------------------Fifth Question-------------------------------------------
    static int sum(int number1,int number2){
        return number1+number2;
    }
    static int substraction(int number1,int number2){
        return number1-number2;
    }
    static int multiplication(int number1,int number2){
        return number1*number2;
    }
    static void division(int number1,int number2){
        if(number2==0){
            System.out.println("Wrong!");
        }else {
            System.out.println("Your answer: "+Double.valueOf(number1/number2));
        }

    }
    static int getAnswer(int number1,int number2,int choice){

        switch (choice){
            case 1:
                return sum(number1,number2);
            case 2:
                return substraction(number1,number2);
            case 3:
                return  multiplication(number1,number2);
            case 4:
                division(number1,number2);
                break;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean checkProcess=true;
        int number1,number2,choice;
        String selection="1-Sum\n2-Substraction\n3-Multiplication\n4-Division\n5-Exit";
        while (checkProcess){
            System.out.println(selection);
            System.out.print("Welcome please select your process: ");
            choice=input.nextInt();
            if(choice<1 || choice>=5){
                System.out.println("See you later.");
                checkProcess=false;
                break;
            }
            System.out.print("Enter first number: ");
            number1=input.nextInt();
            System.out.print("Enter second number: ");
            number2=input.nextInt();
            if(choice!=4){
                System.out.println("Your answer:  "+getAnswer(number1,number2,choice));
            }else{
                getAnswer(number1,number2,choice);
            }
            System.out.println("====================New Process=============================");
    }
    }


    //--------------------------------------Sixth Question-------------------------------------------
    static int getEbob(int number1,int number2){
        int answer=1;
        if(number1>number2){
            for(int i=1;i<=number2;i++){
                if(number1%i==0 && number2%i==0){
                    answer=i;
                }
            }
        }else{
            for(int i=1;i<=number1;i++){
                if(number1%i==0 && number2%i==0){
                    answer=i;
                }
            }
        }
        return answer;
    }
    static int getEkok(int number1,int number2){
        for(int i=1;i<=number1*number2;i++){
            if(i%number1==0 && i%number2==0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int number1,number2;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your first number: ");
        number1=input.nextInt();
        System.out.print("Enter your second number: ");
        number2=input.nextInt();
        System.out.println(number1+" and "+number2+" EBOB-> "+getEbob(number1,number2));
        System.out.println(number1+" and "+number2+" EKOK-> "+getEkok(number1,number2));
    }


    // -------------------------------------Seventh Question-----------------------------------------
    static  boolean isArmstrong(int number){
        int reverseNumber=0,tempNumber=number,value;

        while (number!=0){
            value=number%10;
            reverseNumber=(reverseNumber*10)+value;
            number/=10;
        }
        return reverseNumber==tempNumber;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number=input.nextInt();
        if(isArmstrong(number)){
            System.out.println(number+" is a armstrong number.");
        }else{
            System.out.println(number+" is not armstrong number.");
        }
    }

     */
}






