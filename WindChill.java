public class WindChill
{
	public static void main(String[] args)
	{
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);

		if (Math.abs(t) > 50)
		{
			System.out.println("Temperature is outside the required range");
		}

		else if ((v > 120) || (v < 3))
		{
			System.out.println("Wind speed is outside the required range");
		}
		
		else
		{
			System.out.println("Temperature = " + t);
			System.out.println("Wind speed = " + v);
			System.out.println("Wind chill = " + w);
		}
	}
}
		
		