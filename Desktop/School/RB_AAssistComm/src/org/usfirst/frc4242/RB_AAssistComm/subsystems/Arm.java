// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4242.RB_AAssistComm.subsystems;

import org.usfirst.frc4242.RB_AAssistComm.RobotMap;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class Arm extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController rollerVictor = RobotMap.armRollerVictor;
    DoubleSolenoid armSolenoid = RobotMap.armArmSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public boolean armIsDown = false;
    
    public void armDown() {
    	armSolenoid.set(DoubleSolenoid.Value.kForward);
    	armIsDown = true;
    	rollerOn();
    	SmartDashboard.putBoolean("Arm down", true);
    }
    
    public void armUp() {
    	armSolenoid.set(DoubleSolenoid.Value.kReverse);
    	armIsDown = false;
    	rollerOff();
    	SmartDashboard.putBoolean("Arm down", false);
    }
    
    public void ToggleTheArm() {
    	if (!armIsDown) {
    		armDown();
    	}
    	else {
    		armUp();
    	}
    }
    
    //Roller Code
    public boolean rollersOn = false;
    
    public void rollerOn() {
    	rollerVictor.set(1);
    	rollersOn = true;
    	SmartDashboard.putBoolean("Rollers On", true);
    }
    
    public void rollerOff() {
    	rollerVictor.set(0);
    	rollersOn = false;
    	SmartDashboard.putBoolean("Rollers On", false);
    }
    
    public void ToggleTheRollers() {
    	if (!rollersOn) {
    		rollerOn();
    	}
    	else {
    		rollerOff();
    	}
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

