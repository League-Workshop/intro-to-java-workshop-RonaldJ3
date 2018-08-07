package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot doom = new Robot();
		int sides=10;
		int angles=360/sides;
		for (int i = 0; i <sides;i++) {
			doom.changeRobot(
					"https://lafrikileria.com/21532-large_default/funko-pop-power-rangers-rojo-version-2017.jpg");
			
			doom.move(100);
			doom.turn(-70);
			doom.move(50);
			doom.penUp();
			doom.penDown();
			doom.sparkle();

		}
	}
}
