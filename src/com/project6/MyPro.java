package com.project6;

public class MyPro {
    public static void main(String args[]) 
    {
        int[] array = new int[3];
        try 
        {
            array[7] = 3;
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
    public class Polymorpism 
    {
        public static void main(String args[]) 
        {
            int[] array = new int[3];
            try 
            {
                array[7] = 3;
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
    public class Inheritance 
    {
        public static void main(String args[]) 
        {
            int[] array = new int[3];
            try 
            {
                array[7] = 3;
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
    public class Encapsulation 
    {
        public static void main(String args[]) 
        {
            int[] array = new int[3];
            try 
            {
                array[7] = 3;
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
    
    public class Abstraction 
    {
        public static void main(String args[]) 
        {
            int[] array = new int[7];
            try 
            {
                array[7] = 3;
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
}
