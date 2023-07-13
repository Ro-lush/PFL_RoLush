package homework.Task1;

public class Line {
    private double pointХ1;
    private double pointY1;
    private double pointХ2;
    private double pointY2;
    private boolean length;


    public Line(double pointХ1, double pointY1, double pointХ2, double pointY2) {
        this.pointХ1 = pointХ1;
        this.pointY1 = pointY1;
        this.pointХ2 = pointХ2;
        this.pointY2 = pointY2;
    }

    public double Length(){
    double length= Math.pow(pointХ2-pointХ1,2)+Math.pow(pointY2-pointY1,2);
        return Math.sqrt(length);
    }

    public void Check(Line line){
        double length= (pointХ2-pointХ1)+(pointY2-pointY1);
        if (this.length==line.length){

            System.out.println("Длина равна");
        } else
            System.out.println("Длина не равна");
    }
}
