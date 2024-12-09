// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.AnalogInput;
//import edu.wpi.first.wpilibj.drive.RobotDriveBase.MotorType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants.OperatorConstants;
import frc.robot.R2Jesu_Limelight;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.kauailabs.navx.frc.AHRS;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.REVLibError;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DigitalInput;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Compressor;

public class R2Jesu_HangerSubsystem extends SubsystemBase {
  /** Creates a new R2Jesu_HangerSubsystem. */
  public R2Jesu_HangerSubsystem() {
    hangerCompressor.enableDigital();
  }
  private Compressor hangerCompressor = new Compressor(22, PneumaticsModuleType.CTREPCM);
  private DoubleSolenoid hangerPneumatics = new DoubleSolenoid(22, PneumaticsModuleType.CTREPCM, 0, 1);

  /**
   * R2Jesu_Shooter command factory method.
   *
   * @return a command
   */
  public Command R2Jesu_HangerMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An R2Jesu_Shooter method querying a boolean state of the subsystem (for R2Jesu_Shooter, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean R2Jesu_HangerCondition() {
    // Query some boolean state, such as a digital sensor.
    return true;
  }

  public void forwardHang() {
    hangerPneumatics.set(DoubleSolenoid.Value.kForward);
}  
  public void reverseHang() {
    hangerPneumatics.set(DoubleSolenoid.Value.kReverse);
}  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}