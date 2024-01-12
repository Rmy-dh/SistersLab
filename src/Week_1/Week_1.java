package Week_1;
/*
import java.util.Scanner;

public class Week_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("--------------------First Question---------------------");

        Double realMoney ,lastMoney,kdvOfMoney=0.0;
        Float kdv =0.0f;

        System.out.print("Enter your money: ");
        realMoney=input.nextDouble();

        if(realMoney>0){
            kdv =0.30f;
            kdvOfMoney=realMoney*kdv;
        }else{
            System.out.println("Not Enough money ");
        }
        lastMoney=kdvOfMoney+realMoney;
        if(realMoney>0){
            System.out.println("Your money without kdv : "+realMoney);
            System.out.println("Your money with kdv : "+ lastMoney);
            System.out.println("Your kdv : "+kdv);
        }
        System.out.println("--------------------Second Question---------------------");

        if(1000>realMoney && realMoney>0){
            kdv=0.10f;
            kdvOfMoney=realMoney*kdv;
        }else if(realMoney >= 1000){
            kdv=0.22f;
            kdvOfMoney=realMoney*kdv;

        }else {
            System.out.println("Not Enough money ");
        }
        lastMoney=kdvOfMoney+realMoney;
        if(realMoney>0){
            System.out.println("Your money without kdv : "+realMoney);
            System.out.println("Your money with kdv : "+ lastMoney);
            System.out.println("Your kdv : "+kdv);
        }

        System.out.println("--------------------Third Question---------------------");

        int artHistory,turkish,maths,science;
        float average=0.0f;
        String score="";
        System.out.print("Enter your artHistory : ");
        artHistory=input.nextInt();
        System.out.print("Enter your turkish : ");
        turkish=input.nextInt();
        System.out.print("Enter your maths : ");
        maths=input.nextInt();
        System.out.print("Enter your science : ");
        science=input.nextInt();
        if((artHistory>=0 && turkish >=0 && maths >=0 && science >=0) &&
        (artHistory<=100 && turkish <=100 && maths <=100 && science <=100)){
            average = (artHistory+turkish+maths+science) / 4.0f;
            if(average>=90 && average<=100){
                score="AA";
            }else if(average>=80 && average<=89){
                score="BA";
            }else if(average>=70 && average<=79){
                score="BB";
            }else if(average>=60 && average<=69){
                score="CB";
            }else if(average>=50 && average<=59){
                score="CC";
            }else {
                score="FF";
            }
            System.out.println("Your score: "+score);
        }else{
            System.out.print("Your information not correct!");
        }

        System.out.println("--------------------Fourth Question---------------------");

        double firstNumber,secondNumber,answer=0.0;
        String selection;
        System.out.print("Enter your first number: ");
        firstNumber=input.nextDouble();
        System.out.print("Enter your second number: ");
        secondNumber=input.nextDouble();
        System.out.println("1-Sum\n2-Substraction\n3-Multiplication\n4-Division");
        System.out.print("Select your operation: ");
        selection=input.next();

        if (selection.equals("1")){
            answer=firstNumber+secondNumber;
        }else if(selection.equals("2")){
            answer=firstNumber-secondNumber;
        }else if(selection.equals("3")){
            answer=firstNumber*secondNumber;
        }else if(selection.equals("4")){
            if(secondNumber != 0){
                answer=firstNumber/secondNumber;
            }else{
                System.out.print("Second Number not suitable for this project");
            }
        }else{
            System.out.print("Invalid Process...");
        }
        if(secondNumber != 0 && selection.equals("4")){
            System.out.print("FirstNumber->"+firstNumber+" "+"SecondNumber->"+secondNumber+" "+"Answer->"+answer);
        }else if (!selection.equals("4")){
            System.out.print("FirstNumber->"+firstNumber+" "+"SecondNumber->"+secondNumber+" "+"Answer->"+answer);
        }


        System.out.println("--------------------Fifth Question---------------------");
        System.out.print("Enter number: ");
        int number=input.nextInt();
        if(number%2==0){
            System.out.print("Your number even");
        }else{
            System.out.print("Your number add");
        }

        System.out.println("--------------------Sixth Question---------------------");

        int firstNumber,secondNumber,thirdNumber;
        System.out.print("Enter your first number:");
        firstNumber=input.nextInt();
        System.out.print("Enter your second number:" );
        secondNumber=input.nextInt();
        System.out.print("Enter your third number:");
        thirdNumber=input.nextInt();
        if(firstNumber>secondNumber && firstNumber>thirdNumber){
            if(secondNumber>thirdNumber){
                System.out.print(thirdNumber+"<"+secondNumber+"<"+firstNumber);
            }else{
                System.out.print(secondNumber+"<"+thirdNumber+"<"+firstNumber);
            }
        }else if(secondNumber>firstNumber && secondNumber>thirdNumber){
            if(firstNumber>thirdNumber){
                System.out.print(thirdNumber+"<"+firstNumber+"<"+secondNumber);
            }else{
                System.out.print(firstNumber+"<"+thirdNumber+"<"+secondNumber);
            }
        }else{
            if(firstNumber>secondNumber){
                System.out.print(secondNumber+"<"+firstNumber+"<"+thirdNumber);
            }else{
                System.out.print(firstNumber+"<"+secondNumber+"<"+thirdNumber);
            }

        }
         System.out.println("--------------------Seventh Question---------------------");

        System.out.println("1-Sunny\n2-Rainy\n3-Foggy\n4-Snowy\n5-Cloudy");
        System.out.print("Select your weather: ");
        String information=input.next();
        switch (information){
            case "1":
                System.out.println("It is a sunny day.");
                break;
            case "2":
                System.out.println("It is a rainy day.");
                break;
            case "3":
                System.out.println("It is a foggy day.");
                break;
            case "4":
                System.out.println("It is a snowy day.");
                break;
            case "5":
                System.out.println("It is a cloudy day.");
                break;
            default:
                System.out.println("It is not your day :)");
        }

        System.out.println("--------------------Eighth Question---------------------");

        double firstNumber,secondNumber,answer=0.0;
        String selection;
        System.out.print("Enter your first number: ");
        firstNumber=input.nextDouble();
        System.out.print("Enter your second number: ");
        secondNumber=input.nextDouble();
        System.out.println("1-Sum\n2-Substraction\n3-Multiplation\n4-Division");
        System.out.print("Select your operation: ");
        selection=input.next();
        switch (selection){
            case "1":
                answer=firstNumber+secondNumber;
                break;
            case "2":
                answer=firstNumber-secondNumber;
                break;
            case "3":
                answer=firstNumber*secondNumber;
                break;
            case "4":
                if(secondNumber != 0){
                    answer=firstNumber/secondNumber;
                }
                break;

        }
        System.out.print("Your answer: "+answer);

        System.out.println("--------------------Nineth Question---------------------");

        System.out.println("1-Square\n2-Rectangle\n3-Triangle");
        System.out.print("Select your shape: ");
        String shape=input.next();
        double answer=0.0;
        float height,widht;
        switch (shape){
            case "1":
                System.out.print("Enter your edge: ");
                height=input.nextFloat();
                answer=height*height;
                break;
            case "2":
                System.out.print("Enter your height: ");
                height=input.nextFloat();
                System.out.print("Enter your widht: ");
                widht=input.nextFloat();
                answer=height*widht;
                break;
            case "3":
                System.out.print("Enter your height: ");
                height=input.nextFloat();
                System.out.print("Enter your edge: ");
                widht=input.nextFloat();
                answer=(height*widht)/2;
                break;
            default:
                System.out.println("Your selection not supported.");
        }
        System.out.print("Your answer: "+answer);

        input.close();
    }


}
}

 */
