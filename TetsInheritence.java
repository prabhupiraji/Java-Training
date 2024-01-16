package com.overloading;

//base class 
class Vehicle{
	
	double avarage;
	double price;
	String model;

	void test() {
		System.out.println("parent class");
	}
}

//chield class
class Bike extends Vehicle{
	
void BikeTest() {
		System.out.println(avarage+ " "+price+ ""+ model);
	}
 
}



//driver class
public class TetsInheritence {

	public static void main(String[] args) {
		
     Bike b=new Bike();
     //child class object acess the parent class variables or properties
     b.avarage=20.0;
     b.model="benz";
     b.price=1000000.0;
     b.BikeTest();
     
//    parent method acess using chield class object
     b.test();
     
	}

}
