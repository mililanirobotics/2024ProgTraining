package frc.robot.commands.ShootCommands;

import frc.robot.Constants.FlywheelConstants;
import frc.robot.subsystems.FlywheelSubsystem;
import edu.wpi.first.wpilibj2.command.Command;


public class EjectCommand extends Command {
  private final FlywheelSubsystem m_flywheelSubsystem;

  public EjectCommand(FlywheelSubsystem m_flywheelSubsystem) {
    this.m_flywheelSubsystem = m_flywheelSubsystem;

    addRequirements(m_flywheelSubsystem);
  }

  @Override
  public void initialize() {
    m_flywheelSubsystem.setShootWheel(FlywheelConstants.kScoringSpeed);
  }

  @Override
  public boolean isFinished() {
    return true;
  }
}