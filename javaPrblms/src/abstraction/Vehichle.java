package abstraction;

 abstract class Vehichle {
	
	public abstract String toString();
	
 }
 
 class Car extends Vehichle
 {
	 String carModel;
	 int carYear;
	 public Car(String carModel,int carYear)
    {
		//super();
		this.carModel = carModel;
		this.carYear = carYear;
	}
     @Override
	public String toString()
     {
		return "carModel"+carModel+"carYear"+carYear;
     }
 
	
 }

	
	
	
	
	
	
	
	
	
	
	
	

