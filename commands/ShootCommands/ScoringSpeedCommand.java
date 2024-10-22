package frc.robot.commands.ShootCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.FlywheelConstants;
import frc.robot.subsystems.FlywheelSubsystem;

public class ScoringSpeedCommand extends Command {
    private final FlywheelSubsystem flywheelSubsystem;

    public ScoringSpeedCommand(FlywheelSubsystem flywheelSubsystem) {
        this.flywheelSubsystem = flywheelSubsystem;

        addRequirements(flywheelSubsystem);
    }

    @Override
    public void initialize() {
        flywheelSubsystem.setShootWheel(FlywheelConstants.kScoringSpeed);
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
