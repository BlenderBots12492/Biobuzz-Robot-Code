package org.firstinspires.ftc.teamcode.Robot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.Robot.Subsystems.Chassis;
import org.firstinspires.ftc.teamcode.Robot.Subsystems.Intake;

public class Robot {

    private HardwareMap hardware;

    public Chassis chassis;
    public DcMotor frontLeft;
    public DcMotor backLeft;
    public DcMotor frontRight;
    public DcMotor backRight;
    public Intake intake;
    public DcMotor intakeMotor;
    private void InitializeMotors() {

        frontLeft = hardware.get(DcMotor.class, "FrontLeft");
        backLeft = hardware.get(DcMotor.class, "BackLeft");
        frontRight = hardware.get(DcMotor.class, "FrontRight");
        backRight = hardware.get(DcMotor.class, "BackRight");
        intakeMotor = hardware.get(DcMotor.class, "intake");
        backLeft.setDirection(DcMotor.Direction.REVERSE);
        frontLeft.setDirection(DcMotor.Direction.REVERSE);

        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


    }

    public Robot(HardwareMap HardwareMap) {
        hardware = HardwareMap;
        InitializeMotors();
        intake = new Intake(intakeMotor);
        chassis = new Chassis(frontLeft, backLeft, frontRight, backRight);
    }


}