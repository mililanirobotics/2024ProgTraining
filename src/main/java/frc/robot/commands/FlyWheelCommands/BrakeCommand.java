package frc.robot.commands.FlyWheelCommands;

import frc.robot.subsystems.FlyWheelSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class BrakeCommand extends Command {
    private final FlyWheelSubsystem m_flywheelsubsystem;

    public BrakeCommand(FlyWheelSubsystem m_flywheelsubsystem) {
        this.m_flywheelsubsystem = m_flywheelsubsystem;

        addRequirements(m_flywheelsubsystem);
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
