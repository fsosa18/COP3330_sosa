  import java.util.*;


public class BodyMassIndex
{
	public double weight;
    public double height;
    public double bmi;

    public BodyMassIndex(double h, double w)
    {
        height = h;
        weight = w;
    }

    public double calcBMI()
    {
        System.out.println(weight + "    " + height);
        bmi = (weight/(Math.pow(height, 2)));
        bmi *= 703;
        return bmi;
    }

    public String calcCategory()
    {
        if (bmi < 18.5) 
            return "Underweight < 18.5";
        else if (18.5 < bmi && bmi < 25)
            return "Normal Weight = 18.5 - 24.9"; 
        else if (25 <= bmi && bmi < 30) 
            return "Overweight = 25 - 29.9";
        else
            return "Obesity = BMI of 30 or greater";
    }     
}