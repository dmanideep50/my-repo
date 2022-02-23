package com.project6;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandlingDemo {


		public void Calculator() 
		{
		try {	Scanner sc=new Scanner(System.in);
			System.out.println("Enter Operation");
			int op=sc.nextInt();
			System.out.println("Enter First Number:");
			int s=sc.nextInt();
			System.out.println("Enter Second Number:");
			int p=sc.nextInt();
			sc.close();
			if(op==1)
				System.out.println("Addition:"+(s+p));
			if(op==2)
				System.out.println("Substraction:"+(s-p));
			if(op==3)
				System.out.println("Multiplication:"+(s*p));
			if(op==4)
				System.out.println("Division:"+(s/p));
			File file=new File("E:\\File\\testFile.txt");
			if(file.createNewFile()) {
				System.out.println("File is created");
			}else {
				System.out.println("File is already exist");
			}
			FileWriter w=new FileWriter(file);
			w.append("First Num="+s+"\nSecond Num="+p+"\nOperation Done");
			w.close();
			
			FileReader fr=new FileReader("C:\\Files||testFile1.txt");
			int data;
			while((data=fr.read())!=-1) {
				System.out.println((char)data);
				fr.close();
			}}
			catch(IOException e) {
			System.out.println("");
		}}
		public static void main(String[] args) throws IOException {
			FileHandlingDemo fh=new FileHandlingDemo();
			fh.Calculator();  
		}
	}


