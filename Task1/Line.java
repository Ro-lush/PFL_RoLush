package Task1;

public class Line {
    private double pointХ1;
    private double pointY1;
    private double pointХ2;
    private double pointY2;

    public Line(double pointХ1, double pointY1, double pointХ2, double pointY2) {
        this.pointХ1 = pointХ1;
        this.pointY1 = pointY1;
        this.pointХ2 = pointХ2;
        this.pointY2 = pointY2;
    }

    public double Length(){
        return (pointХ2-pointХ1)+(pointY2-pointY1);
    }
}
