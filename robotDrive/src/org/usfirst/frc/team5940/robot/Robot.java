
package org.usfirst.frc.team5940.robot;

import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This is a demo program showing the use of the RobotDrive class. The
 * SampleRobot class is the base of a robot application that will automatically
 * call your Autonomous and OperatorControl methods at the right time as
 * controlled by the switches on the driver station or the field controls.
 *
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SampleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 *
 * WARNING: While it may look like a good choice to use for your code if you're
 * inexperienced, don't. Unless you know what you are doing, complex code will
 * be much more difficult under this system. Use IterativeRobot or Command-Based
 * instead if you're new.
 */
public class Robot extends SampleRobot {

	public Robot() {

	}

	public void robotInit() {

	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString line to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the
	 * if-else structure below with additional strings. If using the
	 * SendableChooser make sure to add them to the chooser code above as well.
	 */
	public void autonomous() {

	}

	/**
	 * Runs the motors with arcade steering.
	 */
	public void operatorControl() {
		Joystick joyPotato = new Joystick(0);
		CANTalon rightFront = new CANTalon(1);
		CANTalon rightBack = new CANTalon(2);
		CANTalon leftBack = new CANTalon(3);
		CANTalon leftFront = new CANTalon(4);
		while (true) {
			leftFront.set(joyPotato.getRawAxis(0));
			leftBack.set(joyPotato.getRawAxis(0));
			rightFront.set(joyPotato.getRawAxis(5));
			rightBack.set(joyPotato.getRawAxis(5));
		}
	}

	/**
	 * Runs during test mode
	 */
	public void test() {
	}
}
