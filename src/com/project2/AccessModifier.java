package com.project2;

public class AccessModifier {
	protected void display()
    {
   	 System.out.println("hii");
    }
}
class A extends AccessModifier
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.display();
	}

}
