package ConstantOfSisterslab;

public enum ConstantOfInformation {
    NOTHAVEMONEY("You don't have enough money."),
    NOWYOUHAVE("Now, you have : "),
    LOGIN("Login Successfully"),
    ENTERYOURCHOICE("Enter your choice: "),
    LOGINFAILED("Login Failed"),
    SEEYOULATER("See you later!"),
    ENTERMONEY("Enter your amount of money: "),
    PERSONNAME("Person Name: "),
    ENTERPASSWORD("Enter your password: "),
    ENTERNAME("Enter your name: "),
    ENTERSTUDENTNAME("Enter student name: "),
    ENTERSTUDENTGRADE("Enter student grade: "),
    ENTERYOURUPDATENAME("Enter your update name: "),
    ENTERYOURCOMPANYNAME("Enter your company name: "),
    MAKESAMOUNTOFSALES(" makes max amount of sales"),
    ENTERYOURMONEY("Enter your money :"),
    ENTERYOURUPDATEGRADE("Enter your update grade: "),
    ENTERYOURNUMBER("Enter your number :"),
    TOTALAMOUNTOFSALES("Total amount of sales -> "),
    WELCOME("Welcome "),
    SOMETHINGWRONGTRYAGAIN("Something wrong ,try again."),
    DOYOUWANTTOADD("Do you want to add number to Array, please write true or false:  "),
    ANSWERIS("Answer is:"),
    X("x = "),
    SPACE(""),
    RIGHTPARANTHES(")"),
    LEFTPARANTHES(" ("),
    NOTAVAILABLE(" not available! "),
    ENTERYOURSELECTION("Enter your selection: "),
    YOURSELECTION("Your selection: "),
    EVENLIST("Even List-> "),
    ADDLIST("Add List-> "),
    ADDEDSUCCESSFULLY(" added successfully."),
    DELETEDSUCCESSFULLY(" deleted successfully."),
    UPDATEDSUCCESSFULLY(" updated successfully "),
    COMPANYDELETED("Company deleted."),
    COMPANYADDED("Company added."),
    COMPANYNOTFOUND("The company not found!"),
    PLAYERNOTFOUND("Player not found!"),
    DONTHAVEANYPLAYER("You don't have any player."),
    SCOREOFPLAYER("Score of player: "),
    ENTERNEWSCORE("Enter new Score: "),
    ENTERSCORE("Enter score:"),
    SELECTYOURPROCESS("Select your process: "),
    YOURGRADEISNOTCORRECT("Your grade is not correct!"),
    YOUDONTHAVETHISSTUDENT("You don't have this student."),
    ARROW(" -> "),
    MONEY(" money");
    private final String value;
     ConstantOfInformation(String value){
        this.value=value;
    }
    public String getValue(){
        return this.value;
    }

}
