import java.util.Random;
import java.util.Scanner;

public class MonteCarloMethod 
{

	public static void main(String[] args) 
	{

		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the number of values to find inside a circle: ");
		int iterations = inputScanner.nextInt();

		Random randNum = new Random();

		double count = 0;
		double inCircle = 0;

		for (int i = 0; i < iterations; i++)

		{
			double x = randNum.nextDouble();
			double y = randNum.nextDouble();

			double xValue = Math.pow(x, 2);
			double yValue = Math.pow(y, 2);
			double radiusOfCircle = xValue + yValue;

			if (radiusOfCircle <= 1)
			{
				
				inCircle++;
			
			}
			
			count++;
			
		}

		System.out.println("\nNumbers less then or equal to 1 (In circle) " + inCircle);
		System.out.println("\nThe number of iterations is: " + count);

		System.out.println("\nThe number of points in a cirlce divided by the number of");
		System.out.println("points that will less that 1:");
		System.out.println("--------------------------------------------");
		System.out.println(4 * inCircle / iterations);

	}// End of main

}// End of the driver class
