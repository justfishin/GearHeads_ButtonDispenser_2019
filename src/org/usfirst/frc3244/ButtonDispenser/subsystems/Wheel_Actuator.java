// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3244.ButtonDispenser.subsystems;

import org.usfirst.frc3244.ButtonDispenser.RobotMap;
import org.usfirst.frc3244.ButtonDispenser.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3244.ButtonDispenser.Robot;


/**
 *
 */
public class Wheel_Actuator extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController wheelActuatorMotor = RobotMap.wheel_ActuatorWheelActuatorMotor;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void dispenseButton(int buttons){
        int m_buttons = buttons;
        wheelActuatorMotor.set(0.1);
        Timer.delay(1); //eventually change to sensor
        wheelActuatorMotor.set(0.0);
    }
    public void stirButtons(){
        wheelActuatorMotor.set(0.15);
        Timer.delay(3);
        wheelActuatorMotor.set(0.0);
    }
    public void resetButtonDispenser(){
        wheelActuatorMotor.set(-0.15);
        Timer.delay(0.5);
        wheelActuatorMotor.set(0.0);
    }

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new Dispense_Button());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
