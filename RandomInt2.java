public class RandomInt2
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		double r = Math.random();
		int n = b + (int)(r*(a-b) + 1);
		System.out.println(n);
	}
}