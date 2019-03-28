package WhatToEat;

// import scanner
import java.util.Scanner;

public class Dinner {

	public static void main(String[] args) {
		//setup scanner declare variables
		Scanner scan = new Scanner (System.in);
		String eventType;
		int partySize; 
		String result;
		
		// input event type (eventType)
		System.out.print("Will this be a casual, semi-formal, or formal event? ");
		eventType = scan.nextLine();
		eventType = eventType.toLowerCase();		//for output styling

		// input party size (partySize)
		System.out.print("How many people are attending? ");
		partySize = scan.nextInt();
		scan.close();
		
		//initialize result
		result = "Since you're hosting a " + eventType + " event for " + partySize + 
			" participant(s), you should serve ";				
		
		// casual meal, sandwiches
		if (eventType.equals("casual")) {
			
			if (partySize == 1) {
				result = result.concat("sandwiches prepared in the microwave.");
			}
			
			else if ((partySize > 1) && (partySize < 13)) {
				result = result.concat("sandwiches prepared in your kitchen.");
			}
			else if (partySize > 12) {
				result = result.concat("sandwiches prepared by a caterer.");
			}
		}
		
		//semi-formal meal, fried chicken
		else if (eventType.equals("semi-formal")) {
			
			if (partySize == 1) {
				result = result.concat("fried chicken prepared in the microwave.");
			}
			
			else if ((partySize > 1) && (partySize < 13)) {
				result = result.concat("fried chicken prepared in your kitchen.");
			}
			else if (partySize > 12) {
				result = result.concat("fried chicken prepared by a caterer.");
			}
		}
		
		//formal meal, chicken parmesan
		else if (eventType.equals("formal")) {
			
			if (partySize == 1) {
				result = result.concat("chicken parmesan prepared in the microwave.");
			}
			
			else if ((partySize > 1) && (partySize < 13)) {
				result = result.concat("chicken parmesan prepared in your kitchen.");
			}
			
			else if (partySize > 12) {
				result = result.concat("chicken parmesan prepared by a caterer.");
			}
		}
		   
		// print result 
		System.out.print(result);

	}
}
