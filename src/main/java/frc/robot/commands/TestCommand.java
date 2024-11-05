package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TestSubsystem;

public class TestCommand extends Command {
    private final TestSubsystem m_testSubsystem;

    public TestCommand(TestSubsystem testSubsystem) {
        m_testSubsystem = testSubsystem;

        addRequirements(testSubsystem);
    }

    @Override
    public void initialize() {
        m_testSubsystem.leftMotorPower(1);
        m_testSubsystem.rightMotorPower(1);
    }
    // Initialize is what you want the robot to start to do when it starts

    @Override 
    public void execute() {

    }

    @Override
    public void end(boolean interrupted) {
        m_testSubsystem.leftMotorPower(0);
        m_testSubsystem.rightMotorPower(0);
    }
    @Override
    public boolean isFinished() {
        if (m_testSubsystem.returnLeftEncoderCounts() >= 1000) {
            return true;
        }

        else if (m_testSubsystem.returnRightEncoderCounts() >= 1000) {
            return true;
        }

        else {
            return false;
        }

        
    }
}




// Command that powers motor and isFinished command 