package frc.robot.commands.flyWheelCommands;

import frc.robot.subsystems.FlywheelSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class breakCommand extends Command{
    private final FlywheelSubsystem m_flywheelSubsystem;

public breakCommand(FlywheelSubsystem m_flywheelSubsystem) {
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