package org.firstinspires.ftc.teamcode.Status;

public class Hive {
    private Cell redCell;
    private Cell blueCell;
    public Tip tip;
    private Teams.colors teamColor;
    public Hive(Teams.colors team) {
        redCell = new Cell(Teams.colors.RED);
        blueCell = new Cell(Teams.colors.BLUE);
        teamColor = team;
        tip = new Tip();
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

    public void changeStatus() {
        ourCell().ChangeTipStatus(tip.isTipping(teamColor));
    }
}
