package org.firstinspires.ftc.teamcode.Status;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;
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
    private Limelight3A limelight;

    public int getTagId() {
        LLResult result = limelight.getLatestResult();
        if (result == null || !result.isValid()) return -1;

        List<LLResultTypes.FiducialResult> tags = result.getFiducialResults();
        if (tags.isEmpty()) return -1;

        return tags.get(0).getFiducialId();
    }
    public double getTagPitch() {
        LLResult result = limelight.getLatestResult();
        if (result == null || !result.isValid()) return NaN;

        List<LLResultTypes.FiducialResult> tags = result.getFiducialResults();
        if (tags.isEmpty()) return NaN;

        Pose3D pose = tags.get(0).getTargetPoseRobotSpace();
        if (pose == null) return NaN;

        return pose.getOrientation().getPitch(AngleUnit.DEGREES);
    }
    public Cell.tipStatus isTipping(Teams.colors teamcolor) {
        if (teamcolor == RED) {
            if (getTagId() == 30 || getTagId() == 31 || getTagId() == 32 || getTagId() == 33) {
                telemetry.addData("angle", getTagPitch());
                if (getTagPitch() >= 29 && getTagPitch() <= 31) {
                    return null;
                } else if (getTagPitch() <= -29 && getTagPitch() >= -31) {
                    return null;
                } else {
                    return Cell.tipStatus.Tipping;
                }
            } else if (getTagId() == 34 || getTagId() == 35 || getTagId() == 36 || getTagId() == 37) {
                telemetry.addData("angle", getTagPitch());
                if (getTagPitch() <= -29 && getTagPitch() >= -31) {
                    return null;
                } else if (getTagPitch() >= 29 && getTagPitch() <= 31) {
                    return null;
                } else {
                    return Cell.tipStatus.Tipping;
                }
            } else if (getTagPitch() == -1) {
                return null;
            }
        }
        if (teamcolor == BLUE) {
            if (getTagId() == 45 || getTagId() == 44 || getTagId() == 43 || getTagId() == 42) {
                telemetry.addData("angle", getTagPitch());
                if (getTagPitch() >= 29 && getTagPitch() <= 31) {
                    return null;
                } else if (getTagPitch() <= -29 && getTagPitch() >= -31) {
                    return null;
                } else {
                    return Cell.tipStatus.Tipping;
                }
            } else if (getTagId() == 38 || getTagId() == 39 || getTagId() == 40 || getTagId() == 41) {
                telemetry.addData("angle", getTagPitch());
                if (getTagPitch() <= -29 && getTagPitch() >= -31) {
                    return null;
                } else if (getTagPitch() >= 29 && getTagPitch() <= 31) {
                    return null;
                } else {
                    return Cell.tipStatus.Tipping;
                }
            } else if (getTagPitch() == -1) {
                return null;
            }
        }
        return null;
    }

}
