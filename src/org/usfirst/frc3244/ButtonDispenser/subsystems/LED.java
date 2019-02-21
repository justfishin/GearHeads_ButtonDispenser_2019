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


/**
 *
 */
public class LED extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Relay spike1 = RobotMap.lEDSpike1;
    Relay spike2 = RobotMap.lEDSpike2;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void on(){
        spike1.set(Relay.Value.kOn);
        spike2.set(Relay.Value.kOn);
    }
    public void off(){
        spike1.set(Relay.Value.kOff);
        spike2.set(Relay.Value.kOff);
    }
    public void pulse(int cycles){
        int m_cycles = cycles;
        while(m_cycles>0){
            on();
            Timer.delay(0.5);
            off();
        }
    }
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new Solid_LED());
    }
}
