package com.project6;

public class AllStrings {
	 public static void concat1(String s1)
	    {
	        s1 = s1 + "medium low";
	    }
	    public static void concat2(StringBuilder s2)
	    {
	        s2.append("medium low");
	    }
	    public static void concat3(StringBuffer s3)
	    {
	        s3.append("medium low");
	    }
	    public static void main(String[] args)
	    {
	        String s1 = "high";
	        concat1(s1);
	        System.out.println("String: " + s1);
	        StringBuilder s2 = new StringBuilder("high ");
	        concat2(s2);
	        System.out.println("StringBuilder: " + s2);
	        StringBuffer s3 = new StringBuffer("high ");
	        concat3(s3);
	        System.out.println("StringBuffer: " + s3);
	    }
	}
