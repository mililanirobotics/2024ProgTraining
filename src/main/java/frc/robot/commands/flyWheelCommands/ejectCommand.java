package frc.robot.commands.flyWheelCommands;

import frc.robot.Constants.FlywheelConstants;
import frc.robot.subsystems.FlywheelSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class ejectCommand extends Command{
    private final FlywheelSubsystem m_FlywheelSubsystem;

    public ejectCommand(FlywheelSubsystem mFlywheelSubsystem) {
        this.m_FlywheelSubsystem = mFlywheelSubsystem;

        addRequirements(mFlywheelSubsystem);
    }

    @Override
    public void initialize() {
      m_FlywheelSubsystem.setShootWheel(FlywheelConstants.kEjectSpeed);
    }
  
    @Override
    public boolean isFinished() {
      return true;
    }
}