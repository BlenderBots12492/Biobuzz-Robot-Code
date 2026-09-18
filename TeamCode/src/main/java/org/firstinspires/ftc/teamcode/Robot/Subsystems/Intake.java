package org.firstinspires.ftc.teamcode.Robot.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
public class Intake {
    private DcMotor intake;
    public Intake(DcMotor Intake) {
        //initialize and pass through motor name
        intake = Intake;
    }
    //make intake motor turn on
    public void intakeOn() {intake.setPower(1);}
    //make intake motor turn off
    public void intakeOff() {
        intake.setPower(0);
    }
    //make intake motor run backwards
    public void intakeBackward() {
        intake.setPower(-1);
    }
    //Gets the current power of the intake
    public double getPower() {
        return intake.getPower();
    }
}
