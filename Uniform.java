public class Uniform 
{
  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);

    for(int i = 0; i <= N; i++)
    {
      double random = Math.random();
      System.out.println(random + " ");
    }

    System.out.println();
  }
    
}
