package org.firstinspires.ftc.teamcode.Status;

public class Cell {
    public enum tipStatus {
        LoadingZoneSides,
        GardenSides,
        red1up,
        red2up,
        blue1up,
        blue2up
    }
    public Teams.colors color;
    public tipStatus ActiveSide;
    public tipStatus PreviousSide;
    public Cell(Teams.colors cellColor) {
        color = cellColor;
        ActiveSide = tipStatus.GardenSides;
    }
    public void ChangeTipStatus(tipStatus newStatus) {
        if (newStatus == ActiveSide) {
            return;
        }

    }
}
