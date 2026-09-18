package org.firstinspires.ftc.teamcode.Robot;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Robot.Subsystems.Chassis;

public class Robot {
    private hardwareMap hardware;
    public Chassis chassis;
    public DcMotor frontLeft;
    public DcMotor backLeft;
    public DcMotor frontRight;
    public DcMotor backRight;
    private void InitializeMotors() {
        frontLeft = hardware.get(DcMotor.class, "front_left_drive");
        backLeft = hardware.get(DcMotor.class, "back_left_drive");
        frontRight = hardware.get(DcMotor.class, "front_right_drive");
        backRight = hardware.get(DcMotor.class, "back_right_drive");
    }
    public Robot(hardwareMap HardwareMap) {
        hardware = HardwareMap;
        InitializeMotors();
        chassis = new Chassis(frontLeft, backLeft, frontRight, backRight);
    }
}