package Week_3;

import ConstantOfSisterslab.ConstantOfInformation;

import java.util.HashMap;
import java.util.Scanner;

public class PlayerSimulation {
    public static  Scanner input=new Scanner(System.in);
    public static void runPlayerSimulation(int selection,String name,int score,HashMap<String,Integer> list){
        switch (selection){
            case 1:
                list.put(name,score);
                System.out.println(name+ ConstantOfInformation.ADDEDSUCCESSFULLY.getValue());
                break;
            case 2:
                getPlayers(list);
                break;
            case 3:
                removePlayer(name,score,list);

                break;
            case 4:
                updateScore(name,list);
                break;
            case 5:
                getScoreOfPlayer(name,list);
                break;

        }

    }
    public static void removePlayer(String name,int score,HashMap<String,Integer> list){
        if(list.containsKey(name) && list.containsValue(list.get(name))){
            list.remove(name,score);
            System.out.println(name+ ConstantOfInformation.DELETEDSUCCESSFULLY.getValue());
        }else{
            System.out.println(ConstantOfInformation.PLAYERNOTFOUND.getValue());
        }

    }
    public static void updateScore(String name,HashMap<String,Integer> list){
        if(list.containsKey(name)){
            list.remove(name);                                     // remove old player information
            System.out.print(ConstantOfInformation.ENTERNEWSCORE.getValue());
            int newScore=input.nextInt();
            list.put(name,newScore);                               // put new player information
            System.out.println(name+ConstantOfInformation.ARROW.getValue()+newScore);
        }else{
            System.out.println(ConstantOfInformation.PLAYERNOTFOUND.getValue());
        }

    }
    public static void getPlayers(HashMap<String,Integer> list){
        System.out.println("---------Players---------");
        if(!list.isEmpty()){
            for (String nameOfPlayer:list.keySet()){
                System.out.println(nameOfPlayer+ConstantOfInformation.ARROW.getValue() +list.get(nameOfPlayer));
            }
        }else{
            System.out.println(ConstantOfInformation.DONTHAVEANYPLAYER.getValue());
        }

    }
    public static void getScoreOfPlayer(String name,HashMap<String,Integer> list){
        if(list.containsKey(name)){
            System.out.println(ConstantOfInformation.SCOREOFPLAYER.getValue()+list.get(name));
        }else{
            System.out.println(ConstantOfInformation.PLAYERNOTFOUND.getValue());
        }

    }

    public static void main(String[] args) {
        int score=0,selection;
        String name=ConstantOfInformation.SPACE.getValue();

        String process="1-Add new Player\n2-Print Players\n3-Delete Player\n4-Update Score\n5-Get Score Of Player\n6-Log Out!";
        HashMap<String,Integer> list=new HashMap<>();
        System.out.println("---------Welcome Player Simulation---------");
        while(true){
            System.out.println(process);
            System.out.print(ConstantOfInformation.SELECTYOURPROCESS.getValue());
            selection=input.nextInt();
            if(selection>=6 || selection<=0){                    // log out
                System.out.println(ConstantOfInformation.SEEYOULATER.getValue());
                break;
            }
            if(selection==1 || selection==3){                   // add and delete player
                System.out.print(ConstantOfInformation.ENTERNAME.getValue());
                name=input.next();
                System.out.print(ConstantOfInformation.ENTERSCORE.getValue());
                score=input.nextInt();
            }
            if (selection==4 || selection==5){                  // update player score
                System.out.print(ConstantOfInformation.ENTERNAME.getValue());
                name=input.next();
            }
            runPlayerSimulation(selection,name,score,list);
            System.out.println("---------New Process---------");


        }

    }
}
