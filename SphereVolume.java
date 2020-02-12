import java.util.Scanner;

public class SphereVolume 
{ 
	public static void main(String[] args) 
	{ 
		// add your declaration and code here 
		System.out.println("This program gives the volume of a sphere");
		System.out.println("What is the diameter:  ");
		Scanner input = new Scanner(System.in);
		double four = 4;
		double three = 3;
		double diameter = input.nextDouble();
		double radius = diameter / 2;
		double volume = (four / three) * Math.PI * Math.pow(radius, 3);
		System.out.println("The volume is " + volume);
		
		input.close();
	} 
} 
