package org.firstinspires.ftc.teamcode.Status;

public class Hive {
    private Cell redCell;
    private Cell blueCell;
    private Teams.colors teamColor;
    public Hive(Teams.colors team) {
        redCell = new Cell(Teams.colors.RED);
        blueCell = new Cell(Teams.colors.BLUE);
        teamColor = team;
    }
    public Cell ourCell() {
        if (teamColor == Teams.colors.RED) {
            return redCell;
        } else {
            return blueCell;
        }
    }
    public Cell otherCell() {
        if (teamColor == Teams.colors.BLUE) {
            return redCell;
        } else {
            return blueCell;
        }
    }
}
