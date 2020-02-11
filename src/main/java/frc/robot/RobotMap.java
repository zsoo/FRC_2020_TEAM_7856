/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;
  public static final int DRIVETRAIN_LEFT_FRONT_TALON = 3;
  public static final int DRIVETRAIN_LEFT_REAR_TALON = 5;
  public static final int DRIVETRAIN_RIGHT_FRONT_TALON = 2;
  public static final int DRIVETRAIN_RIGHT_REAR_TALON = 4;
  public static final int OI_DRIVER_CONTROLLER = 0;
  public static final int OI_DRIVER_CONTROLLER_1 = 1;
  public static final int DRIVER_CONTROLLER_X_AXIS = 0;
  public static final int DRIVER_CONTROLLER_Y_AXIS = 1;
  public static final int DRIVER_CONTROLLER_ROTATE_AXIS = 4;
  public static final int SOLENOID_CYLINDER_FORWARD = 1;
  public static final int SOLENOID_CYLINDER_RETRACT = 2;
  public static final int SOLENOID_SUCTIONCUPS_FORWARD = 3;
  public static final int SOLENOID_SUCTIONCUPS_RETRACT = 4;
  public static final int CylinderShootButton = 1;
  public static final int CylinderRetractButton = 2;
  public static final int SuctionOnButton = 3;
  public static final int SuctionOffButton = 4;
  public static final int HatchOn = 5;
  public static final int SuctionCupsON = 3;
  public static final int SuctionCupOff = 4;
  public static final int ROTATE_90 = 90;
  public static final int ROTATE_180 = 180;
  public static final int ROTATE_270 =270;
  public static final int ROTATE_360 = 0;
  public static final int COMPRESSOR = 0;
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
