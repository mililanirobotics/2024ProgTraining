package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.FlyWheelSubsystem;

public class ScoringSpeedCommand extends Command{
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private final FlyWheelSubsystem m_flywheelSubsystem;

    public ScoringSpeedCommand(FlyWheelSubsystem m_flywheelSubsystem) {
        this.m_flywheelSubsystem = m_flywheelSubsystem;

        addRequirements(m_flywheelSubsystem);
    }

    @Override
    public void initialize() {
        m_flywheelSubsystem.setShootFlyWheel(100);
    }

    @Override
    public boolean isFinished() {
        return true;
    }


}
