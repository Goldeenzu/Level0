import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SimpleQuiz {
	JFrame window;
	JPanel panel;
	JButton stuff1;
	JButton stuff2;
	JButton stuff3;
	JButton stuff4;
public static void main(String[] args) {
	SimpleQuiz x = new SimpleQuiz();
}
SimpleQuiz(){
	window = new JFrame("This is a quiz");
	panel = new JPanel();
	stuff1 = new JButton();
	stuff2 = new JButton();
	stuff3 = new JButton();
	stuff4 = new JButton();
	window.setVisible(true);
	window.setSize(500,500);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.add(panel);
	panel.add(stuff)
}
}
