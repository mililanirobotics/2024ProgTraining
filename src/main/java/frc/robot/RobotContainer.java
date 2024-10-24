// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


// import com.revrobotics.CANSparkBase.ControlType;

import edu.wpi.first.wpilibj.GenericHID;
// import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.GamePadConstants;
// import frc.robot.commands.Autos;
import frc.robot.commands.Feeder.FeederCommand;
import frc.robot.commands.Feeder.ReverseFeederCommand;
import frc.robot.commands.ShootCommands.BrakeCommand;
import frc.robot.commands.ShootCommands.EjectCommand;
import frc.robot.commands.ShootCommands.NeutralOutCommand;
import frc.robot.commands.ShootCommands.ScoringSpeedCommand;
import frc.robot.subsystems.FlywheelSubsystem;


public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final FlywheelSubsystem m_FlywheelSubsystem = new FlywheelSubsystem();
  private final GenericHID controller = new GenericHID(0);
  
  public RobotContainer(){

    configureBindings();
  }
  
  private void configureBindings() {
  
    new JoystickButton(controller, GamePadConstants.kAButtonPort).onTrue(
      new ScoringSpeedCommand(m_FlywheelSubsystem)
    );
    new JoystickButton(controller, GamePadConstants.kBButtonPort).onTrue(
      new NeutralOutCommand(m_FlywheelSubsystem)
    );
    new JoystickButton(controller, GamePadConstants.kXButtonPort).onTrue(
      new EjectCommand(m_FlywheelSubsystem)
    );
    new JoystickButton(controller, GamePadConstants.kYButtonPort).onTrue(
      new BrakeCommand(m_FlywheelSubsystem)
    );
    new JoystickButton(controller, GamePadConstants.kRightBumperPort).onTrue(
      new ReverseFeederCommand(m_FlywheelSubsystem, controller)
    );
    new JoystickButton(controller, GamePadConstants.kLeftBumperPort).onTrue(
      new FeederCommand(m_FlywheelSubsystem, controller)
    );

  }
  public Command getAutonomousCommand(){
    return null;
  }

}
