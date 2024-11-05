// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

// import frc.robot.Constants.OperatorConstants;
import frc.robot.Constants.OperatorConstants.GamepadConstants;
// import frc.robot.commands.Autos;
// import frc.robot.commands.ExampleCommand;
import frc.robot.commands.FeederCommands.FeedCommand;
import frc.robot.commands.FeederCommands.ReverseFeedCommand;
import frc.robot.commands.FlyWheelCommands.BrakeCommand;
import frc.robot.commands.FlyWheelCommands.EjectCommand;
import frc.robot.commands.FlyWheelCommands.NeutralOutCommand;
import frc.robot.commands.FlyWheelCommands.ScoringSpeedCommand;
// import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.FlyWheelSubsystem;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;
// import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
// import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  private final GenericHID controller = new GenericHID(0);
  private final FlyWheelSubsystem m_flywheelSubsystem = new FlyWheelSubsystem();


  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
      new JoystickButton(controller, GamepadConstants.kAButtonPort).onTrue(
        new ScoringSpeedCommand(m_flywheelSubsystem)
      );

      new JoystickButton(controller, GamepadConstants.kBButtonPort).onTrue(
        new BrakeCommand(m_flywheelSubsystem)
      );

      new JoystickButton(controller, GamepadConstants.kXButtonPort).onTrue(
        new NeutralOutCommand(m_flywheelSubsystem)
      );

      new JoystickButton(controller, GamepadConstants.kYButtonPort).onTrue(
        new EjectCommand(m_flywheelSubsystem)
      );

      new JoystickButton(controller, GamepadConstants.kLeftBumperPort).onTrue(
        new FeedCommand(m_flywheelSubsystem, controller)
      );

      new JoystickButton(controller, GamepadConstants.kRightBumperPort).onTrue(
        new ReverseFeedCommand(m_flywheelSubsystem, controller)
      );
  }

  public Command getAutoCommand() {
      return null;
  }


}
