package frc.robot.subsystems;

import com.ctre.phoenix6.controls.NeutralOut;
import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.GamePadConstants;
import frc.robot.Constants.FlywheelConstants;

public class FlywheelSubsystem extends SubsystemBase{
    private TalonFX feedFlywheel;
    private TalonFX shootFlywheel;
    private VelocityVoltage shootFlywheelVelocity = new VelocityVoltage(0);
    public FlywheelSubsystem() {
      feedFlywheel = new TalonFX(FlywheelConstants.kFeedFlywheelId);
      shootFlywheel = new TalonFX(FlywheelConstants.kFeedFlywheelId);
    }
    


     public void setShootWheel(double velocity) {
        shootFlywheel.setControl(shootFlywheelVelocity.withVelocity(velocity));
     }
    public void setFeedWheel(double power) {
        feedFlywheel.set(power);
    }
    public void zeroOutFlywheel() {
        shootFlywheel.setControl(new NeutralOut());
    }
    public void brakeShootFlywheel() {
        shootFlywheel.setControl(shootFlywheelVelocity.withVelocity(0));
    }

    @Override
    public void periodic() {

    }
    

}

