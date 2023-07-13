package homework.Task3;


public class Main  {
    public static void main(String[] args)  throws Exception {
          try {
              ExceptionCatching.catchMe();
          } catch (NullPointerException e){
              System.out.println("NullPointer");
          } catch (ArithmeticException e){
              System.out.println("ArithExc");
          }


    }
}
