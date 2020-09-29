  import java.util.*;


public class App
{
	// Reads in whether or not user would like to enter more data
	public static boolean moreInput()
	{
		// Asks user for initial input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to enter any more input? Please enter 'Y' or 'N'");
		char ans = scan.next().charAt(0);

		// Loops until input is valid and returns appropriate value
		while (true)
		{	
			if (ans == 'Y' || ans == 'y')
				return true;
			if (ans == 'N' || ans == 'n')
				return false;
			System.out.println("Please enter only 'Y' or 'N'");
			ans = scan.next().charAt(0);
		}
	}

	// Asks user for height
	public static double getUserHeight()
	{
		// Asks user for initial height value
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your height in inches.");
		double height = -1;

		// Loops until height value is valid and returns it
		while (height < 0)
			height = scan.nextDouble();
		return height;
	}

	// Asks user for weight
	public static double getUserWeight()
	{
		//Asks user for initial weight value
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your weight in pounds.");
		double weight = -1;

		// Loops until weight value is valid and returns it
		while(weight < 0)
			weight = scan.nextDouble();
		return weight;
	}


	// Displays info within a single BMI object
	public static void displayBmiInfo(BodyMassIndex bmi)
	{
		System.out.println("The BMI is: " + bmi.calcBMI() + " and the category is: " + bmi.calcCategory());  
	}


	// Displays info for a list of BMI objects
	public static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) 
	{
		double total = 0;
		double avg = 0;
		for(int i = 0; i < bmiData.size(); i++)
			total += bmiData.get(i).calcBMI();
		avg = total / bmiData.size();
		System.out.println("The average BMI is: " + avg);
	}


	// Main function, as copied from hw description
	public static void main(String[] args) 
	{
    	ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();
    	while (moreInput())
    	{
 	    	double height = getUserHeight();
    	    double weight = getUserWeight();
        	BodyMassIndex bmi = new BodyMassIndex(height, weight);
        	bmiData.add(bmi);
        	displayBmiInfo(bmi);
    	}
	    displayBmiStatistics(bmiData);
	}
}