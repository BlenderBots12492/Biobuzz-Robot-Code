package org.firstinspires.ftc.teamcode.Robot.Subsystems;


import com.qualcomm.robotcore.hardware.DcMotor;

public class Chassis {
    private DcMotor frontRight;
    private DcMotor frontLeft;
    private DcMotor backRight;
    private DcMotor backLeft;

    public Chassis(DcMotor FrontRight, DcMotor FrontLeft, DcMotor BackRight, DcMotor BackLeft) {
     frontRight = FrontRight;
     frontLeft = FrontLeft;
     backRight = BackRight;
     backLeft =   BackLeft;

    }

    public void setPowers(double forward, double strafe, double turn) {
        frontRight.setPower(forward - strafe - turn);
        frontLeft.setPower(forward + strafe + turn);
        backLeft.setPower(forward - strafe + turn);
        backRight.setPower(forward + strafe - turn);
    }
}