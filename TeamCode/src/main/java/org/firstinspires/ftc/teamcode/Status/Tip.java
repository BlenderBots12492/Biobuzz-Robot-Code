package org.firstinspires.ftc.teamcode.Status;

import static org.firstinspires.ftc.teamcode.Status.Teams.colors.BLUE;
import static org.firstinspires.ftc.teamcode.Status.Teams.colors.RED;
import static java.lang.Double.NaN;

import com.qualcomm.hardware.limelightvision.LLResult;
import com.qualcomm.hardware.limelightvision.LLResultTypes;
import com.qualcomm.hardware.limelightvision.Limelight3A;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.Pose3D;

import java.util.List;

public class Tip {
    public Limelight3A limelight;

    public int getTagId() {
        LLResult result = limelight.getLatestResult();
        if (result == null || !result.isValid()) return -1;

        List<LLResultTypes.FiducialResult> tags = result.getFiducialResults();
        if (tags.isEmpty()) return -1;

        return tags.get(0).getFiducialId();
    }
    public double getTagAngle() {
        LLResult result = limelight.getLatestResult();
        if (result == null || !result.isValid()) return NaN;

        List<LLResultTypes.FiducialResult> tags = result.getFiducialResults();
        if (tags.isEmpty()) return NaN;

        Pose3D pose = tags.get(0).getTargetPoseRobotSpace();
        if (pose == null) return NaN;

        return pose.getOrientation().getRoll(AngleUnit.DEGREES);
    }

    public int getSide() {
        if (getTagId() == 30 || getTagId() == 31 || getTagId() == 32 || getTagId() == 33) {return 1;}
        if (getTagId() == 34 || getTagId() == 35 || getTagId() == 36 || getTagId() == 37) {return 2;}
        if (getTagId() == 38 || getTagId() == 39 || getTagId() == 40 || getTagId() == 41) {return 3;}
        if (getTagId() == 42 || getTagId() == 43 || getTagId() == 44 || getTagId() == 45) {return 4;}
        return 0;
    }

    public Cell.tipStatus whatSideUp() {
        if (getSide() == 1 && getTagAngle() <= -25 && getTagAngle() >= -32) {return Cell.tipStatus.red1up;}
        if (getSide() == 2 && getTagAngle() >= 25 && getTagAngle() <= 32) {return Cell.tipStatus.red2up;}
        if (getSide() == 3 && getTagAngle() <= -30 && getTagAngle() >= -37) {return Cell.tipStatus.blue1up;}
        // fix blue 2 up tuning
        if (getSide() == 4 && getTagAngle() >= -20 && getTagAngle() <= -41.5) {return Cell.tipStatus.blue2up;}
        return null;
    }

}
