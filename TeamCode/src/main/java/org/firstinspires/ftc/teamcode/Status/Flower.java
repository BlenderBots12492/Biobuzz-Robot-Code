package org.firstinspires.ftc.teamcode.Status;
import java.util.Vector;

import com.pedropathing.math.Pose;

public class Flower {
    public Vector<Ball> balls;
    public Pose pose;
    Flower(Pose position) {
        pose = position;
        for (int i = 0; i < 4; i++) {
            balls.add(new Ball(Ball.Type.Pollen, Ball.Color.noColor));
        }
    }
}
