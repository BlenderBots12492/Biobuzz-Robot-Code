package org.firstinspires.ftc.teamcode.Status;
import java.util.Vector;

import com.pedropathing.math.Pose;

public class Garden {
    public Vector<Ball> balls;
    public Pose pose;
    Garden(Pose position) {
        pose = position;
        for (int i = 0; i < 4; i++) {
            balls.add(new Ball(Ball.Type.Pollen, Ball.Color.noColor));
        }
    }
}
