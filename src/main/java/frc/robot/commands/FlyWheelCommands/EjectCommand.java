package frc.robot.commands.FlyWheelCommands;

import frc.robot.Constants.FlyWheelConstants;
import frc.robot.subsystems.FlyWheelSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class EjectCommand extends Command {
    private final FlyWheelSubsystem m_flywheelSubsystem;

    public EjectCommand(FlyWheelSubsystem m_flywheelSubsystem) {
        this.m_flywheelSubsystem = m_flywheelSubsystem;

        addRequirements(m_flywheelSubsystem);
    }

    @Override
  public void initialize() {
    m_flywheelSubsystem.setShootFlyWheel(FlyWheelConstants.kEjectSpeed);
  }

  @Override
  public boolean isFinished() {
    return true;
  }
}
