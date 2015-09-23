import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variable in this recipe. 
 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs. */

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 40;		//the size of the black part of the star
		int flameSize = 500;		//the length of the flaming arms

		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 1. Make a new robot, and set it's pen down.
		Robot steven = new Robot("mini");
		// 12. Set the robot speed to 10
		steven.setSpeed(10);

		// 13. Make all the code below repeat 25 times
		 for (int i = 0; i <25; i++) {
			
		

			// 2. Turn the robot 1/8 of a circle
		steven.turn(45);
		steven.penDown();
			// 3. Move the robot 64 pixels
		steven.move(64);

			
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			steven.turn(-40);
			// 5. Move the robot the distance in the variable flameSize
			steven.setPenColor(255, 203, 27);
			steven.move(flameSize);
			// 6. Turn the robot 170 degrees
			steven.turn(160);
			// 7. Move the robot the distance in the variable flameSize (again)
			steven.move(flameSize);
			// 8. Turn the robot 64 degrees to the right
			steven.turn(74);
			steven.setPenColor(0, 0, 0);
			// 9. Move the robot the distance in the variable baseSize
			steven.move(baseSize);
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			// 11. Color your ninja star like Figure 2.
		 }
	}

}

