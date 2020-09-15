import java.util.*;

public class Decrypt
{
	//declaring constant size of input & output
	public static final int SIZE = 4;

	//Overall function decrypting the number
	public static String encrypt(String input)
	{
		//puts int into an array from the string
		int tempNum = Integer.parseInt(input);
		int num[] = new int[SIZE];
		for(int i = SIZE - 1; i >= 0; i--)
		{
			int tempDig = tempNum % 10;
			tempNum /= 10;
			num[i] = changeDig(tempDig);
		}

		//swaps digits
		for(int i = 0; i < SIZE/2; i++)
		{
			num = swapDig(num, i, i+2);
		}

		//returns contents of array as a string
		return arrToString(num);
	}

	//Encrypts each digit, adding 7, getting raminder after dividing by 10
	public static int changeDig(int input)
	{
		int num = input;
		if(num < 7)
			num += 10;
		num -= 7;
		return num;
	}

	//Swaps required digits(1 & 3, 2 & 4) to complete encryption
	public static int[] swapDig(int[] input, int ind1, int ind2)
	{
		int [] arr = input;
		int temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
		return arr;
	}

	//Changes the array to a string, in order to return the required type
	public static String arrToString(int[] arr)
	{
		String num = "";
		for(int i = 0; i < SIZE; i++)
		{
			String dig = Integer.toString(arr[i]);
			num += dig;

		}
		return num;
	}

	public static void main(String [] args)
	{
		System.out.println(encrypt("0189")); //1234
		System.out.println(encrypt("7777")); //0000
		System.out.println(encrypt("9810")); //4321
	}
}