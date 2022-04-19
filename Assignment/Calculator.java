package week1.day2.Assignment;

public class Calculator {
	public int add(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
		
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	public double  mul(double num1, double num2) {
		return num1*num2;
	}
	public float  divide(float num1, float num2) {
		return num1/num2;
	}
}

 class MyCalculator{
	 public static void main(String args[]) {
		 //Creating constructor to call the method
		 Calculator cal= new Calculator();
		 int add = cal.add(10, 20, 30);
		 System.out.println("Addtion of num1+num2+num3 is "+add);
		 int sub = cal.sub(100, 50);
		 System.out.println("Subraction of num1- num2 is "+sub);
		 double mul = cal.mul(10.10, 10.10);
		 System.out.println("Multiplication of num1*num2 is "+mul);
		 float divide = cal.divide(6, 3);
		 System.out.println("Divison of num1/num2 is "+divide);
	 }
	
}