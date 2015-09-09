

	// Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;

	/**
	 * Airline registration 
	 * 
	 * You are writing a program for a new airline to take their registration information at the check-in counter
	 * and print their boarding pass. You need to collect the following information: 
	 * 		First name 
	 * 		Last name
	 * 		Destination airport 
	 * 		Birthday (for security purposes) 
	 * 		Male/female (for security purposes) 
	 * 
	 * Print the boarding pass in this format:
	 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
	 * Traveling to: DESTINATION
	 * 
	 * Toolbox: main() method, JOptionPane.showInputDialog, variables
	 * 
	 **/
	public class AirlineRegistration {
		public static void main(String[] args) {
			
		String firstname = JOptionPane.showInputDialog(null, "What is your first name?");
		String lastname = JOptionPane.showInputDialog(null, "What is your last name?");
		String destination = JOptionPane.showInputDialog(null, "Where is your destination?");
		String birthday = JOptionPane.showInputDialog(null, "What is your birthday? (Month, day, year)");
		String gender = JOptionPane.showInputDialog(null, "What is your gender?");
		JOptionPane.showMessageDialog(null, lastname + " / " + firstname + " (" + birthday + ", " + gender + ") \n"+ "Traveling to: " + destination);
	}
		
	}


