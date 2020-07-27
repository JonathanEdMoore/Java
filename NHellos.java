public class NHellos
{
  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);

    for (int i = 1; i <= n; i++)
    {
      if((i % 100 >= 11) && (i % 100 <= 13))
      {
        System.out.println(i + "th Hello");
      }
      else
      {
        switch(i % 10)
        {
          case 1: System.out.println(i + "st Hello"); break;
          case 2: System.out.println(i + "nd Hello"); break;
          case 3: System.out.println(i + "rd Hello"); break;
          default: System.out.println(i + "th Hello"); break;
        }
      }
    }
  }
}