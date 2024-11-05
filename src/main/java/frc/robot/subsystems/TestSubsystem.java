package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkRelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.TestConstants;

public class TestSubsystem extends SubsystemBase {
    private final CANSparkMax leftMotor;
    private final CANSparkMax rightMotor;
    private final RelativeEncoder leftMotorEncoder;
    private final RelativeEncoder rightMotorEncoder;
    
    public TestSubsystem() {
        leftMotor = new CANSparkMax(TestConstants.kLeftMotorId, MotorType.kBrushless);
        rightMotor = new CANSparkMax(TestConstants.kRightMotorId, MotorType.kBrushless);
        leftMotorEncoder = leftMotor.getEncoder(SparkRelativeEncoder.Type.kHallSensor, TestConstants.kCountsPerRevolution);
        rightMotorEncoder = rightMotor.getEncoder(SparkRelativeEncoder.Type.kHallSensor, TestConstants.kCountsPerRevolution);
        
    }

    public void leftMotorPower(double power) {
        leftMotor.set(power);
    }

    public void rightMotorPower(double power) {
        rightMotor.set(power);
    }

    public double returnLeftEncoderCounts() {
        return leftMotorEncoder.getPosition();
    }

    public double returnRightEncoderCounts() {
        return rightMotorEncoder.getPosition();
    }

}

