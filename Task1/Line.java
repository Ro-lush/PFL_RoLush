package Task1;

public class Line {
    private double point1;
    private double point2;

    public Line(double point1, double point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double Length(){
        return point2-point1;
    }
}
