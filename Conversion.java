package week1.day1.Assignment1;

public class Conversion {

	// To convert negative number to positive and to print the number

	public static void main(String[] args) {

		int neg = -40;
		int post;

		if (neg < 0) {
			post = neg * (-1);
			System.out.print("The number "+neg+" is converted to "+post);

		}

	}
}
