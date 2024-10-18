package frc.robot.commands.FlyWheelCommands;

import frc.robot.subsystems.FlyWheelSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class NeutralOutCommand extends Command{
    private final FlyWheelSubsystem m_flywheelsubsystem;

    public NeutralOutCommand(FlyWheelSubsystem m_flywheelSubsystem) {
        this.m_flywheelsubsystem = m_flywheelSubsystem;
    
        addRequirements(m_flywheelSubsystem);
      }
    
      @Override
      public void initialize() {
        m_flywheelsubsystem.brakeShootFlywheel();
      }
    
      @Override
      public boolean isFinished() {
        return true;
      }
}
