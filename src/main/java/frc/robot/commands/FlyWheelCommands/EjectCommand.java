package frc.robot.commands.FlyWheelCommands;

import frc.robot.Constants.FlyWheelConstants;
import frc.robot.subsystems.FlyWheelSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class EjectCommand extends Command {
    private final FlyWheelSubsystem m_flywheelsubsystem;

    public EjectCommand(FlyWheelSubsystem m_flywheelsubsystem) {
        this.m_flywheelsubsystem = m_flywheelsubsystem;

        addRequirements(m_flywheelsubsystem);
    }

    @Override
  public void initialize() {
    m_flywheelsubsystem.setShootFlyWheel(FlyWheelConstants.kEjectSpeed);
  }

  @Override
  public boolean isFinished() {
    return true;
  }
}
