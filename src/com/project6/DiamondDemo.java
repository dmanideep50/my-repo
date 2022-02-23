package com.project6;

public class DiamondDemo {
	public static void main(String args[]) 
    {
        int[] array = new int[5];
        try 
        {
            array[8] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }
    }
}
