package frc.robot.commands.FeedCommands;

import frc.robot.Constants.FlywheelConstants;
import frc.robot.Constants.GamePadConstants;
import frc.robot.subsystems.FlywheelSubsystem;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;

public class ReverseFeedCommand extends Command{
    private FlywheelSubsystem m_FlywheelSubsystem;
    private GenericHID joystick;

public ReverseFeedCommand(FlywheelSubsystem m_FlywheelSubsystem, GenericHID joystick) {
        this.m_FlywheelSubsystem = m_FlywheelSubsystem;
        this.joystick = joystick;
        
        addRequirements(m_FlywheelSubsystem);
    }
    @Override
public void initialize(){
    m_FlywheelSubsystem.setFeedWheel(FlywheelConstants.kFeedSpeed);
    }

@Override
public void end(boolean interupted) {
    m_FlywheelSubsystem.setFeedWheel(0);
    }

@Override
public boolean isFinished() {
    return !joystick.getRawButton(GamePadConstants.kRightBumperPort);
    }
}