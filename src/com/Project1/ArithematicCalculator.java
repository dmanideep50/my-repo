package com.Project1;

public class ArithematicCalculator {
	static int addition(int a,int b) {
		int result=a+b;
		return result;
	}
		static int substraction(int a,int b) {
			int result=a-b;
			return result;
		}
		static int multiplication(int a,int b) {
			int result=a*b;
			return result;
		}
		static int division(int a,int b) {
			int result=a/b;
			return result;
		}
		static int modulus(int a,int b) {
			int result=a%b;
			return result;
		}
		public static void main(String args[])
		{
		    //Scanner sc=new Scanner(System.in);
			int var1=20;//Integer.parseInt(sc.nextLine());
			//Scanner sc1=new Scanner(System.in);
			int var2=4;//nteger.parseInt(sc1.nextLine());
			int add=addition(var1,var2);
			System.out.println("The value after addition: "+add);
			int sub=substraction(var1,var2);
			System.out.println("The value after substraction: "+sub);
			int mul=multiplication(var1,var2);
			System.out.println("The value after multiplication: "+mul);
			int div=division(var1,var2);
			System.out.println("The value after division: "+div);
			int mod=modulus(var1,var2);
			System.out.println("The value after modulus: "+mod);
		}

}
