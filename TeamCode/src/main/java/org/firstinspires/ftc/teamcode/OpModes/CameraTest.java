package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Status.Cell;
import org.firstinspires.ftc.teamcode.Status.Teams;
import org.firstinspires.ftc.teamcode.Status.Tip;

@TeleOp(name = "Camera Test")
public class CameraTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        Tip tip = new Tip();
        Limelight3A limelight = hardwareMap.get(Limelight3A.class, "limelight");
        limelight.setPollRateHz(100); // This sets how often we ask Limelight for data (100 times per second)
        limelight.start(); // This tells Limelight to start looking!
        tip.limelight = limelight;
        waitForStart();
        while (opModeIsActive()) {
            telemetry.addData("Test", "test");
            telemetry.addData("Upside:", tip.whatSideUp());
            telemetry.addData("Angle 1: ", tip.getTagAngle());
            telemetry.addData("Tag ID: ", tip.getTagId());
            telemetry.update();
        }
    }
}
