package frc.robot.commands.FeederCommands;

import frc.robot.Constants.FlyWheelConstants;
import frc.robot.Constants.OperatorConstants.GamepadConstants;
import frc.robot.subsystems.FlyWheelSubsystem;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;

public class ReverseFeedCommand extends Command {
    private final FlyWheelSubsystem m_flywheelSubsystem;
    private GenericHID joystick;

    public ReverseFeedCommand(FlyWheelSubsystem m_flywheelSubsystem, GenericHID joystick) {
        this.m_flywheelSubsystem = m_flywheelSubsystem;
        this.joystick = joystick;
    
        addRequirements(m_flywheelSubsystem);
    }

    @Override
    public void initialize() {
        m_flywheelSubsystem.setFeedWheel(-FlyWheelConstants.kFeedSpeed);
  }


    @Override
    public void end(boolean interrupted) {
        m_flywheelSubsystem.setFeedWheel(0);
  }

  @Override
  public boolean isFinished() {
    return !joystick.getRawButton(GamepadConstants.kAButtonPort);
  } 
}

