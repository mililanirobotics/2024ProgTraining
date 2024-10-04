package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.controls.NeutralOut;
import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

import frc.robot.Constants.FlywheelConstants;

public class FlyWheelSubsystem extends SubsystemBase{
    private final TalonFX feedFlywheel;
    private final TalonFX shootFlywheel;
    private final VelocityVoltage shootFlywheelVelocity = new VelocityVoltage(0);
    



    public FlyWheelSubsystem() {
        feedFlywheel = new TalonFX(FlywheelConstants.kFeedFlywheelId);
        shootFlywheel = new TalonFX(FlywheelConstants.kShootFlywheelId);
    }

    public void setFeedWheel(double power) {
        feedFlywheel.set(power);
    }

    public void setShootFlyWheel(double velocity) {
        shootFlywheel.setControl(shootFlywheelVelocity.withVelocity(velocity));
    }

    public void brakeFeedFlywheel() {
        feedFlywheel.set(0);
    }

    public void zeroOutFeedFlywheel() {
        shootFlywheel.setControl(new NeutralOut());
    }

    public void brakeShootFlywheel() {
        shootFlywheel.setControl(shootFlywheelVelocity.withVelocity(0));
    }


     




    private boolean getRawButton(int kabuttonport) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRawButton'");
    }

    @Override
    public void periodic() {

    }
}
    

