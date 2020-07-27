public class BetweenZeroAndOne
{
  public static void main(String[] args)
  {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);

    boolean t = ((x > 0) && (x < 1)) && ((y > 0) && (y < 1));

    System.out.println(t);
  }
}