import static org.junit.Assert.*;
import org.junit.Test;

public class BodyMassIndexTest
{
	
	@Test
	public void bodyMassIndexCategoriesShouldBeCorrect()
	{
		// Creates BMI object of category: Underweight (15)
		BodyMassIndex bmiTest_underweight0 = new BodyMassIndex(65, 90.14935989);

		// Creates BMI object of category: Normal (18.5)
		BodyMassIndex bmiTest_normal0 = new BodyMassIndex(55, 105);

		// Creates BMI object of category: Normal (22)
		BodyMassIndex bmiTest_normal1 = new BodyMassIndex(55, 105);

		// Creates BMI object of category: Overweight (25)
		BodyMassIndex bmiTest_overweight0 = new BodyMassIndex(55, 105);

		// Creates BMI object of category: Overweight  (28)
		BodyMassIndex bmiTest_overweight1 = new BodyMassIndex(55, 105);

		// Creates BMI object of category: Obese  (30)
		BodyMassIndex bmiTest_obese0 = new BodyMassIndex(55, 105);
		
		// Creates BMI object of category: Obese (35)
		BodyMassIndex bmiTest_obese1 = new BodyMassIndex(55, 105);

		/*
		// Assert statements:
			// Underweight
		assertEquals("BMI must be 15", 15.0, bmiTest_underweight0.calcBMI());
		assertEquals(bmiTest_underweight0.calcCategory().equals("Underweight < 18.5"), "BMI category must be underweight");		

			// Normal
		assertEquals( "BMI must be 18.5", 18.5, bmiTest_normal0.calcBMI());
		assertEquals( "BMI must be 22", 22.0, bmiTest_normal1.calcBMI());
		assertEquals(bmiTest_normal0.calcCategory().equals("Normal Weight = 18.5 - 24.9"), "BMI category must be normal");		
		assertEquals(bmiTest_normal1.calcCategory().equals("Normal Weight = 18.5 - 24.9"), "BMI category must be normal");		

			// Overweight
		assertEquals( "BMI must be 25", 25.0, bmiTest_overweight0.calcBMI());
		assertEquals( "BMI must be 28", 28.0, bmiTest_overweight1.calcBMI());
		assertEquals(bmiTest_overweight0.calcCategory().equals("Overweight = 25 - 29.9"), "BMI category must be overweight");		
		assertEquals(bmiTest_overweight1.calcCategory().equals("Overweight = 25 - 29.9"), "BMI category must be overweight");		
			//Obese
		assertEquals( "BMI must be 30", 30.0, bmiTest_obese0.calcBMI());
		assertEquals( "BMI must be 35", 35.0, bmiTest_obese1.calcBMI());
		assertEquals(bmiTest_obese0.calcCategory().equals("Obesity = BMI of 30 or greater"), "BMI category must be obese");
		assertEquals(bmiTest_obese1.calcCategory().equals("Obesity = BMI of 30 or greater"), "BMI category must be obese");
		*/


		// Assert statements:
		// Underweight
		assertEquals(15.0, bmiTest_underweight0.calcBMI());
		assertEquals(bmiTest_underweight0.calcCategory().equals("Underweight < 18.5"), "BMI category must be underweight");

		// Normal
		assertEquals(18.5, bmiTest_normal0.calcBMI());
		assertEquals( 22.0, bmiTest_normal1.calcBMI());
		assertEquals(bmiTest_normal0.calcCategory().equals("Normal Weight = 18.5 - 24.9"), "BMI category must be normal");
		assertEquals("BMI category must be normal", bmiTest_normal1.calcCategory());

		// Overweight
		assertEquals( 25.0, bmiTest_overweight0.calcBMI());
		assertEquals( 28.0, bmiTest_overweight1.calcBMI());
		assertEquals(bmiTest_overweight0.calcCategory().equals("Overweight = 25 - 29.9"), "BMI category must be overweight");
		assertEquals(bmiTest_overweight1.calcCategory().equals("Overweight = 25 - 29.9"), "BMI category must be overweight");
		//Obese
		assertEquals( 30.0, bmiTest_obese0.calcBMI());
		assertEquals( 35.0, bmiTest_obese1.calcBMI());
		assertEquals(bmiTest_obese0.calcCategory().equals("Obesity = BMI of 30 or greater"), "BMI category must be obese");
		assertEquals(bmiTest_obese1.calcCategory().equals("Obesity = BMI of 30 or greater"), "BMI category must be obese");

	}	
}

  