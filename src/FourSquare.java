
	import javax.swing.JOptionPane;
	import org.jointheleague.graphical.robot.Robot;

	public class FourSquare {
	
		

		Robot bob = new Robot();

		void go() {

			bob.setSpeed(10);
			bob.setPenWidth(5);

			for (int i = 0; i <4; i++) {
				bob.setRandomPenColor();
				bob.turn(90);
			drawSquare();
			}
		}


		void drawSquare() {
			for (int i = 0; i <4; i++) {
				bob.penDown();
				bob.move(100);
				bob.turn(90);
			}

			
			
		}

		public static void main(String[] args) {
			new FourSquare().go();
		}

	}





