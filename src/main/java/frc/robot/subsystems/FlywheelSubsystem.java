package frc.robot.subsystems;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.NeutralOut;
import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

// import edu.wpi.first.wpilibj.GenericHID;
// import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import frc.robot.Constants.GamePadConstants;
import frc.robot.Constants.FlywheelConstants;

public class FlywheelSubsystem extends SubsystemBase{
    private TalonFX feedFlywheel;
    private TalonFX shootFlywheel;
    private VelocityVoltage shootFlywheelVelocity = new VelocityVoltage(0);
    public FlywheelSubsystem() {
      feedFlywheel = new TalonFX(FlywheelConstants.kFeedFlywheelId);
      shootFlywheel = new TalonFX(FlywheelConstants.kShootFlywheelId);

        TalonFXConfiguration FeedConfig = new TalonFXConfiguration();

        TalonFXConfiguration ShootConfig = new TalonFXConfiguration();
        ShootConfig.Slot0.kS = 0.1; // Add 0.1 V output to overcome static friction
        ShootConfig.Slot0.kV = 0.12; // A velocity target of 1 rps results in 0.12 V output
        ShootConfig.Slot0.kP = 0.11; // An error of 1 rps results in 0.11 V output
        ShootConfig.Slot0.kI = 0.1; // no output for integrated error
        ShootConfig.Slot0.kD = 0; // no output for error derivative

        feedFlywheel.getConfigurator().apply(FeedConfig);
        shootFlywheel.getConfigurator().apply(ShootConfig);
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

