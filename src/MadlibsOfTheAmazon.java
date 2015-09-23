import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		String adjective = JOptionPane.showInputDialog(null, "Enter in an adjective");
		String liquid = JOptionPane.showInputDialog(null, "Enter in a type of liquid");
		String part = JOptionPane.showInputDialog(null, "Enter in a body part");
		String verb = JOptionPane.showInputDialog(null, "Enter in a verb");
		String place = JOptionPane.showInputDialog(null, "Enter in a place");
		// Fit the user's words into this sentence, and save it in a String:
		JOptionPane.showMessageDialog(null, "Piranhas are more " + adjective + " during the day, so cross the river at \nnight"
		+"Piranhas are attracted to fresh " + liquid + " and will most \nlikely take a bite out of your " + part + " if you " + verb
		+ ".  Whatever you do, if you have an open wound, try to find another way to get \nback to the " + place + ".  Good luck!");
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

