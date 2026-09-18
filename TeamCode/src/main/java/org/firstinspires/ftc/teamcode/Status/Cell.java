package org.firstinspires.ftc.teamcode.Status;

public class Cell {
    public enum tipStatus {
        LoadingZoneSides,
        GardenSides,
        Tipping
    }
    public Teams.colors color;
    public tipStatus ActiveSide;
    public tipStatus PreviousSide;
    public Cell(Teams.colors cellColor) {
        color = cellColor;
        ActiveSide = tipStatus.GardenSides;
        PreviousSide = tipStatus.Tipping;
    }
    public void ChangeTipStatus(tipStatus newStatus) {
        if (newStatus == ActiveSide) {
            return;
        }
        if (newStatus == tipStatus.Tipping) {
            PreviousSide = ActiveSide;
        } else {
            ActiveSide = newStatus;
        }

    }
}
