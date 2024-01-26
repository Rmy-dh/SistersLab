package Week_3;

import java.util.HashMap;
import java.util.Scanner;

public class PlayerSimulation {
    public static  Scanner input=new Scanner(System.in);
    public static void runPlayerSimulation(int selection,String name,int score,HashMap<String,Integer> list){
        switch (selection){
            case 1:
                list.put(name,score);
                System.out.println(name+" added successfully.");
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
            System.out.println(name+ " deleted successfully.");
        }else{
            System.out.println("Player not found!");
        }

    }
    public static void updateScore(String name,HashMap<String,Integer> list){
        if(list.containsKey(name)){
            list.remove(name);                                     // remove old player information
            System.out.print("Enter new Score: ");
            int newScore=input.nextInt();
            list.put(name,newScore);                               // put new player information
            System.out.println(name+" -> "+newScore);
        }else{
            System.out.println("Player not found!");
        }

    }
    public static void getPlayers(HashMap<String,Integer> list){
        System.out.println("---------Players---------");
        if(!list.isEmpty()){
            for (String nameOfPlayer:list.keySet()){
                System.out.println(nameOfPlayer+" -> " +list.get(nameOfPlayer));
            }
        }else{
            System.out.println("You don't have any player.");
        }

    }
    public static void getScoreOfPlayer(String name,HashMap<String,Integer> list){
        if(list.containsKey(name)){
            System.out.println("Score of player: "+list.get(name));
        }else{
            System.out.println("Player not found!");
        }

    }

    public static void main(String[] args) {
        int score=0,selection;
        String name="";

        String process="1-Add new Player\n2-Print Players\n3-Delete Player\n4-Update Score\n5-Get Score Of Player\n6-Log Out!";
        HashMap<String,Integer> list=new HashMap<>();
        System.out.println("---------Welcome Player Simulation---------");
        while(true){
            System.out.println(process);
            System.out.print("Select your process: ");
            selection=input.nextInt();
            if(selection>=6 || selection<=0){                    // log out
                System.out.println("See you later.");
                break;
            }
            if(selection==1 || selection==3){                   // add and delete player
                System.out.print("Enter name:");
                name=input.next();
                System.out.print("Enter score:");
                score=input.nextInt();
            }
            if (selection==4 || selection==5){                  // update player score
                System.out.print("Enter name:");
                name=input.next();
            }
            runPlayerSimulation(selection,name,score,list);
            System.out.println("---------New Process---------");


        }

    }
}
