import javax.swing.JOptionPane;


public class Greater {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null, "What is your name");
		JOptionPane.showMessageDialog(null, "Hello " + answer);
	}

}
