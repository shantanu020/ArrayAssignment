
public class FanObject {
	String brand;
	int no_of_blades;
	float price;
	void display(){
		System.out.println("Brand: "+brand);
		System.out.println("Number of blades: "+no_of_blades);
		System.out.println("Price: "+price);
	}

	public static void main(String[] args) {
		FanObject fan=new FanObject();
		fan.brand="Orient";
		fan.no_of_blades=3;
		fan.price=3500f;
		fan.display();
	}
}
