package frc.robot.commands.FeedCommands;

import frc.robot.Constants.FlywheelConstants;
import frc.robot.Constants.GamePadConstants;
import frc.robot.subsystems.FlywheelSubsystem;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;

public class  FeedCommand extends Command {
    private FlywheelSubsystem m_flywheelSubsystem;
    private GenericHID joystick;

public FeedCommand(FlywheelSubsystem flywheelSubsystem, GenericHID joystick) {
    this.m_flywheelSubsystem = m_flywheelSubsystem;
    this.joystick = joystick;

    addRequirements(m_flywheelSubsystem);
    }

@Override
public void initialize(){
    m_flywheelSubsystem.setFeedWheel(FlywheelConstants.kFeedSpeed);
    }

@Override
public void end(boolean interupted) {
    m_flywheelSubsystem.setFeedWheel(0);
    }

@Override
public boolean isFinished() {
    return !joystick.getRawButton(GamePadConstants.kRightBumperPort);
    }

}