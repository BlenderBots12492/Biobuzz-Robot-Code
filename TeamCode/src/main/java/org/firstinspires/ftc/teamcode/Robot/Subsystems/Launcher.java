package org.firstinspires.ftc.teamcode.Robot.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Launcher {

    private DcMotor launchWheel1;
    private DcMotor launchWheel2;

    //initialize
    public Launcher(DcMotor LaunchWheel1, DcMotor LaunchWheel2) {
        launchWheel1 = LaunchWheel1;
        launchWheel2 = LaunchWheel2;
    }

    //turn on launch wheels
    public void launch() {
        launchWheel1.setPower(1);
        launchWheel2.setPower(1);
    }

    //turn off launch wheels
    public void stopLaunch() {
        launchWheel1.setPower(0);
        launchWheel2.setPower(0);
    }

}
