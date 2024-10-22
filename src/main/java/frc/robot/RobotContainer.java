// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.GamePadConstants;
import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.FeedCommands.FeedCommand;
import frc.robot.commands.FeedCommands.ReverseFeedCommand;
import frc.robot.commands.ShootCommands.ScoringSpeedCommand;
import frc.robot.commands.flyWheelCommands.breakCommand;
import frc.robot.commands.flyWheelCommands.ejectCommand;
import frc.robot.commands.flyWheelCommands.neutralOutCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.FlywheelSubsystem;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {
  private final FlywheelSubsystem m_FlywheelSubsystem = new FlywheelSubsystem();
  private final GenericHID controller = new GenericHID(0);

  public RobotContainer() {
    
    configureBindings();
  }
  
  private void configureBindings() {
   
    new JoystickButton(controller, GamePadConstants.kAButtonPort).onTrue(
      new ScoringSpeedCommand(m_FlywheelSubsystem)
    );

    new JoystickButton(controller, GamePadConstants.kBButtonPort).onTrue(
      new breakCommand(m_FlywheelSubsystem)
    );
    new JoystickButton(controller, GamePadConstants.kYButtonPort).onTrue(
      new ejectCommand(m_FlywheelSubsystem)
    );
    new JoystickButton(controller, GamePadConstants.kXButtonPort).onTrue(
      new neutralOutCommand(m_FlywheelSubsystem)
    );

    new JoystickButton(controller, GamePadConstants.kLeftBumperPort).onTrue(
      new FeedCommand(m_FlywheelSubsystem, controller)
    );

    new JoystickButton(controller, GamePadConstants.kRightBumperPort).onTrue(
      new ReverseFeedCommand(m_FlywheelSubsystem, controller)
    );
  }
}
