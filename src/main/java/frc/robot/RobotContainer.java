// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.util.controller.BetterXboxController;

public class RobotContainer {
  private final BetterXboxController driverController = new BetterXboxController(0, BetterXboxController.Hand.LEFT, BetterXboxController.Humans.DRIVER);
  private final BetterXboxController operatorController = new BetterXboxController(1, BetterXboxController.Humans.OPERATOR);

  private final SendableChooser<Command> autoChooser = new SendableChooser<>();

  public RobotContainer() {
    autoConfig();
  }

  private void configureButtonBindings() {
  }

  private void autoConfig() {
    autoChooser.setDefaultOption("Nothing", new WaitCommand(0));
//    Change this to fit your auto
//    autoChooser.addOption("AUTO 1", new DrivePathing(Trajectories.SAMPLE_PATH1));
//    autoChooser.addOption("AUTO 2", new DrivePathing(Trajectories.SAMPLE_PATH2));

    SmartDashboard.putData("Auto Command", autoChooser);
  }

  public Command getAutonomousCommand() {
    return autoChooser.getSelected();
  }
}