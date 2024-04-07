package Week_3;

import ConstantOfSisterslab.ConstantOfInformation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeSystem {
    public static Scanner input=new Scanner(System.in);
    public static void solveSelection(int selection,String name,int grade,HashMap<String,Integer> list){
        switch (selection){
            case 1:
                addStudentToList(name,grade,list);
                break;
            case 2:
                updateStudentList(name,grade,list);
                break;
            case 3:
                deleteStudentFromList(name,grade,list);
                break;
            case 4:
                printList(list);
                break;
            case 5:
                getGradeOfStudent(name,list);
                break;
        }
    }
    public static  void addStudentToList(String name, int grade,HashMap<String,Integer> list){
        if(grade>=0 && grade<=100){
            list.put(name,grade);
            System.out.println(name+ ConstantOfInformation.ADDEDSUCCESSFULLY.getValue());
        }else{
            System.out.println(ConstantOfInformation.YOURGRADEISNOTCORRECT.getValue());
        }
    }
    public  static void updateStudentList(String name,int grade, HashMap<String ,Integer> list){
        String newName;
        int newGrade;
        if(list.containsKey(name) && list.containsValue(grade)){
            System.out.print(ConstantOfInformation.ENTERYOURUPDATENAME.getValue());
            newName=input.next();
            System.out.print(ConstantOfInformation.ENTERYOURUPDATEGRADE.getValue());
            newGrade=input.nextInt();
            list.remove(name);                                      // remove old value and add new value
            list.put(newName,newGrade);
            System.out.println(newName+ConstantOfInformation.UPDATEDSUCCESSFULLY.getValue());
        }else{
            System.out.println(ConstantOfInformation.YOUDONTHAVETHISSTUDENT.getValue());
        }
    }
    public  static void deleteStudentFromList(String name,int grade, HashMap<String,Integer> list){
        if(list.containsKey(name) && list.containsValue(list.get(name))){
            list.remove(name,grade);
            System.out.println(name+ConstantOfInformation.DELETEDSUCCESSFULLY.getValue());
        }else{
            System.out.println(name + ConstantOfInformation.NOTAVAILABLE.getValue());
        }
    }
    public static void printList(HashMap<String,Integer> list){
        System.out.println("---------Your List---------");
        for(Map.Entry<String ,Integer> entry:list.entrySet()){
            System.out.println(entry.getKey()+ConstantOfInformation.ARROW.getValue() + entry.getValue() );
        }
    }
    public static void getGradeOfStudent(String  name, HashMap<String,Integer> list){
        if(list.containsKey(name)){
            System.out.println(name+ConstantOfInformation.ARROW.getValue()+list.get(name));
        }else{
            System.out.println(name + ConstantOfInformation.NOTAVAILABLE.getValue());
        }
    }
    public static void main(String[] args) {
        String name=ConstantOfInformation.SPACE.getValue();
        int selection,grade=0;
        String menu="1-Add student\n2-Update Student\n3-Delete Student\n4-Print Student List\n5-Give Student Grade\n6-Log Out!";

        HashMap<String ,Integer> list=new HashMap<>();
        System.out.println("---------Welcome Student Grade System--------");

        while ( true ){
            System.out.println(menu);
            System.out.print(ConstantOfInformation.YOURSELECTION.getValue());
            selection=input.nextInt();
            if( selection>=6 || selection<=0){                                  // log out system
                System.out.println("---------See you later---------");
                break;
            }
            if (selection==1 || selection==3 ) {                                // add and delete
                System.out.print(ConstantOfInformation.ENTERSTUDENTNAME.getValue());
                name = input.next();
                System.out.print(ConstantOfInformation.ENTERSTUDENTGRADE.getValue());
                grade = input.nextInt();
            }
            if(selection==5){                                                   // get 1 student grade
                System.out.print(ConstantOfInformation.ENTERSTUDENTNAME.getValue());
                name = input.next();
            }
            solveSelection(selection,name,grade,list);
            System.out.println("---------New Process---------");
        }
    }
}
