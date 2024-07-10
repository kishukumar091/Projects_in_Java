package JavaProject;
import java.util.Random;

import java.util.*;
public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        // Enter 0 for Rock
        // Enter 1 for Paper
        // Enter 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Choice:");
        System.out.println("A. 0 for Rock");
        System.out.println("B. 1 for Paper");
        System.out.println("C. 2 for Scissor");
        System.out.print("Your Choice: ");
        int userInput = sc.nextInt();
        if(userInput==0){
            System.out.println("Your Choice: Rock");
        }
        else if (userInput==1) {
            System.out.println("Your Choice: Paper");
        }
        else{
            System.out.println("Your Choice: Scissor");
        }

        Random rd = new Random();
        int computerInput = rd.nextInt(3);
        if(computerInput==0){
            System.out.println("Computer Choice: Rock");
        }
        else if (computerInput==1) {
            System.out.println("Computer Choice: Paper");
        }
        else{
            System.out.println("Computer Choice: Scissor");
        }


        if(userInput==computerInput){
            System.out.println("Draw");
        }
        else if (userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1){
            System.out.println("You Win!");
        }
        else{
            System.out.println("Computer Win!");
        }
    }
}