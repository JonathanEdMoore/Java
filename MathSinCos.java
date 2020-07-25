public class MathSinCos
{
	public static void main(String[] args)
	{
		double q = Double.parseDouble(args[0]);
		double r = (Math.sin(q) * Math.sin(q)) + (Math.cos(q) * Math.cos(q));
		System.out.println(r);
	}
}