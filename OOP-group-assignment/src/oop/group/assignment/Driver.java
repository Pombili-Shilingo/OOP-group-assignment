package oop.group.assignment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Menu();
    }

    private static void Menu() {
        Scanner input = new Scanner(System.in);
        
        int logChoice,choice,logInAttemps=0;
        
        System.out.println((char)27 + "[33m\t\t▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀"+(char)27 + "[0m");
        System.out.println((char)27+ "[0m"+(char)27 + "[30m\t\t                 Parking & Vehicle Management Systems                            "+(char)27+ "[0m");
        System.out.println((char)27 + "[33m\t\t▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄"+(char)27+ "[0m");
        Calendar calender = Calendar.getInstance();
        SimpleDateFormat dateformatter = new SimpleDateFormat(" dd MMMMMMMMM',' yyyy ");
        System.out.println((char)27 + "[31m                                           Date - "+ (char)27 + "[0m"+ dateformatter.format(calender.getTime()));
        
        
        for(int chooseLogIn=1;chooseLogIn==1;){
            
        System.out.println((char)27 + "[33m\t\t▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀"+(char)27 + "[0m");
    	System.out.println("\t\t1. Login                 ");
        System.out.println("\t\t2. Quit                  ");
        System.out.println((char)27 + "[33m\t\t▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀"+(char)27 + "[0m");
        System.out.print((char)27 +"[31m\t\tEnter Log In Choice: "+(char)27+ "[0m");
    	logChoice = input.nextInt();                        
    }
    
}
