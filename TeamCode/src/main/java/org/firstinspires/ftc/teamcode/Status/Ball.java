package org.firstinspires.ftc.teamcode.Status;

public class Ball {
    public enum Type {
        Pollen,
        Nectar
    }
    public enum Color {
        noColor,
        Blue,
        Red
    }
    public double Weight;
    public Type type;
    public Color color;
    Ball(Type ourType, Color ourColor) {
        type = ourType;
        color = ourColor;
        if (type == Type.Pollen) {
            Weight = 25;
        } else {
            Weight = 41.3;
        }
    }
}
