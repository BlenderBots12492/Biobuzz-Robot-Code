package org.firstinspires.ftc.teamcode.OpModes;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Robot.Robot;

@TeleOp(name="Test Drive")
public class TestDrive extends LinearOpMode {
    @Override
    public void runOpMode() {
        Robot rbot = new Robot(hardwareMap);
        waitForStart();
        while (opModeIsActive()) {
            rbot.chassis.setPowers(-gamepad1.left_stick_y, -gamepad1.left_stick_x, -gamepad1.right_stick_x);
        }
    }

}
