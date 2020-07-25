public class SinOfDouble
{
	public static void main(String[] args)
	{
		double t = Double.parseDouble(args[0]);
		double v = Math.sin(2*t) + Math.sin(3*t);
		System.out.println(v);
	}
}