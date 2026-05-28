public class Car{
	String brand = "A";
	int model = 54321;
	double price = 60000;
void printCar(){
	System.out.println("Details of Car-A:");
	System.out.println(brand+" "+model+" "+price);
}


public static void main(String args[]){
	Car c1 = new Car();
	c1.printCar();
	Car c2 = new Car();
        c2.printCar();
}	
}
 
 