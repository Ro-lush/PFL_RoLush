package Task1;

public class Main {
    public static void main(String[] args) {
       Line line1 = new Line(1,1,2,2);
       Line line2 = new Line(-3,0,1,1);
       line1.Check(line2);
       line2.Check(line2);

      System.out.println(line1.Length()+" " + line2.Length());


    }
}
