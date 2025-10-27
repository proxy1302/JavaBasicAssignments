package com.assignmentsnumber1;

public class Q2 {
// Area of reactangle  and circle
	public static void main(String[] args) {
	

	double areaofrectangle=recatngle();
	double Areaofcircle=circle();
	System.out.println(areaofrectangle);
	System.out.println(Areaofcircle);
		
		
	}
	
	public static double recatngle() {
		double length=10;
		double width=20;
		double area=length*width;
	   return area;
      }
	 public static Double circle() {
		 double radius=12; 
		  double Area=2*3.14*radius*radius;
		  return Area;
	 }

}
