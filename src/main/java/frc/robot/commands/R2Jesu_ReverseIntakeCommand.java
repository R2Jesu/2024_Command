// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.R2Jesu_ShooterSubsystem;

import edu.wpi.first.wpilibj2.command.Command;

/** An R2Jesu_ReverseIntake command that uses an R2Jesu_Shooter subsystem. */
public class R2Jesu_ReverseIntakeCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final R2Jesu_ShooterSubsystem m_subsystem;
  

  /**
   * Creates a new R2Jesu_ReverseIntakeCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public R2Jesu_ReverseIntakeCommand(R2Jesu_ShooterSubsystem subsystem) {
    m_subsystem = subsystem;
   
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_subsystem.reverseIntake();
  }
  
 
  

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}