package frc.robot.commands.FlyWheelCommands;

import frc.robot.subsystems.FlyWheelSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class NeutralOutCommand extends Command{
    private final FlyWheelSubsystem m_flywheelSubsystem;

    public NeutralOutCommand(FlyWheelSubsystem m_flywheelSubsystem) {
        this.m_flywheelSubsystem = m_flywheelSubsystem;
    
        addRequirements(m_flywheelSubsystem);
      }
    
      @Override
      public void initialize() {
        m_flywheelSubsystem.brakeShootFlywheel();
      }
    
      @Override
      public boolean isFinished() {
        return true;
      }
}
