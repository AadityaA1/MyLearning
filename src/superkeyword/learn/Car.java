package superkeyword.learn;

public class Car extends Vehicle{

	int maxSpeed=200;
	Car(){
		super();
		 //Using super keyword to call the constructor in the base class //Super keyword should be the first call in the child class constructor
		System.out.println("Car Constructor");
	}
	public void display(){
		System.out.println(super.maxSpeed); //Using super keyword to call the base class variable
	}
	
	public void message(){
		System.out.println("Car message");
	}
	
	public void displayMessage(){
		//Call current class method
		message();
		super.message(); //calling parent class method using super keyword
	}
}
