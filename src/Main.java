/**
 * A class which holds the main method which determines if the server made minimum wage or not
 * @author Emma Gertje
 */

import java.util.Scanner;

public class Main {
    public static Scanner keyboard;

	public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        String repeat = "Yes"; //this is setting repeat to yes so the method will run at least one time
        String name = "";
        double cashTips = 0.0;
        double cardTips = 0.0;
        double salary = 0.0;
        double hoursWorked = 0.0;
        double minWage = 0.0;
        String response = "";
        String response1 = "";
        while (repeat.equals("Yes") || repeat.equals("yes")) { //this while loop will keep running if the user wants to enter another server's info
            System.out.print("Enter the server's name here: ");
            name = keyboard.nextLine();
            System.out.print("Enter the server's cash tips: ");
            cashTips = Double.parseDouble(keyboard.nextLine()); //I am converting these into doubles to keep the nextLine() consistent throughout the program
            System.out.print("Enter the server's card tips: ");
            cardTips = Double.parseDouble(keyboard.nextLine());
            System.out.print("Enter the server's salary per hour: ");
            salary = Double.parseDouble(keyboard.nextLine());
            System.out.print("Enter the hours the server worked: ");
            hoursWorked = Double.parseDouble(keyboard.nextLine());
            System.out.print("What is the minumum wage in your state? ");
            minWage = Double.parseDouble(keyboard.nextLine());
            Server server1 = new Server(name, cashTips, cardTips, salary, hoursWorked);
            System.out.print(server1.mainMethodResponse(minWage));
            System.out.print(" ");
            System.out.print("Would you like to enter another server's information? ");
            while (!response.equals("yes") || !response.equals("no")) { //this while loop will keep reiterating until I get either a yes or a no response, which are the only 2 valid responses
            	response1 = keyboard.nextLine();
            	String response2 = response1.toLowerCase(); //this is converting the response into lower case to make it easier to deal with
            	if (response2.equals("yes") || response2.equals("yes.")) { //this is checking to see if the response is a yes and if it is, the while loop will break and the entire program will be repeated
            		response = "yes";
            		repeat = "yes";
            		break;
            	}
            	if (response2.equals("no") || response2.equals("no.")) { //this is checking to see if the response is a no and if it is, the while loop will break and the program will not be repeated
            		response = "no";
            		repeat = "no";
            		System.out.print("You have chosen not to enter another server's information. You are now finished.");
            		break;
            	}
            	else { //if the response isn't a yes or a no, the while loop will repeat until a valid response is gained
            		System.out.print("That was not a valid response. Please type in either a yes or a no. ");
            		continue;
            	}
            	
            
            	
            }
            
             
        }
      
	}
	
}