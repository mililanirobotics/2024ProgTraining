package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.FlyWheelSubsystem;

public class ScoringSpeedCommand extends Command{
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private final FlyWheelSubsystem flywheelSubsystem;

    public ScoringSpeedCommand(FlyWheelSubsystem flywheelSubsystem) {
        this.flywheelSubsystem = flywheelSubsystem;

        addRequirements(flywheelSubsystem);
    }

    @Override
    public void initialize() {
        flywheelSubsystem.setShootFlyWheel(100);
    }

    @Override
    public boolean isFinished() {
        return true;
    }


}
