// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class GamepadConstants {
    public static final int kPrimaryGamepadPort = 0;
    public static final int kSecondaryGamepadPort = 1;
    public static final int kTestingGamepadPort = 2;

    //Gamepad Axis Ports
    public static final int kleftXJoystickPort = 0;
    public static final int kLeftYJoystickPort = 1;
    public static final int kRightXJoystickPort = 4;
    public static final int kRightYJoystickPort = 5; 
    public final static int kLeftTriggerPort = 2;
    public final static int kRightTriggerPort = 3;

    //Gamepad Button Ports
    public final static int kAButtonPort = 1;
    public final static int kBButtonPort = 2;
    public final static int kXButtonPort = 3;
    public final static int kYButtonPort = 4;
    public final static int kLeftBumperPort = 5;
    public final static int kRightBumperPort = 6;
    public final static int kBackButtonPort = 7;
    public final static int kStartButtonPort = 8;   

    //joystick port for the gamepad
    public final static int kPrimaryLeftStickPort = 0;
    public final static int kPrimaryRightStickPort = 1;

    //Dpad values
    public final static int kDpadUp = 0;
    public final static int kDpadDown = 180;

    //Deadzone value
    public final static double kDeadzone = 0.2;
  }
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
}
