package Task1;

public class Main {
    public static void main(String[] args) {
       Line line1 = new Line(1,1,2,2);
       Line line2 = new Line(-3,0,1,1);
       line1.Check(line2);
       line2.Check(line2);

      System.out.println("Длина первой линии: "+line1.Length()+
              " " +"\n" +"Длина второй линии: "+line2.Length());


    }
}
