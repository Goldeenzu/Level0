import java.io.IOException;

import javax.swing.JOptionPane;


public class blastoff {
public static void main(String[] args) throws InterruptedException, IOException {
	for (int i = 10; i >0; i--) {
		//JOptionPane.showMessageDialog(null, ("" + i));
		Runtime.getRuntime().exec("say " + i).waitFor();
	}
	JOptionPane.showMessageDialog(null, "BLAST OFF");
	Runtime.getRuntime().exec("say " + "Blast off").waitFor();
}
}
