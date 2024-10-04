package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.FlyWheelSubsystem;
import frc.robot.Constants.FlywheelConstants;

public class ScoringSpeedCommand extends Command{
    private final FlyWheelSubsystem flywheelSubsystem;

    public ScoringSpeedCommand(FlyWheelSubsystem flywheelSubsystem) {
        this.flywheelSubsystem = flywheelSubsystem;
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
