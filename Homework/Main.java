package Homework;

public class Main {

	public static void main(String[] args) {
		
		MiniVan miniVan1 = new MiniVan("XXXXXX", 145f, 10);
		System.out.println(miniVan1 + " speed is " + miniVan1.getMaximalSpeed1());
		
		TucTuc tuctuc = new TucTuc("YYYYYYY", 45f, 3);
		System.out.println(tuctuc + " speed is " + tuctuc.getMximalSpeed());
		
		Batmobile batman = new Batmobile("ZZZZZZZ", 75f, false);
		System.out.println(batman + " speed is " + batman.getMximalSpeed());
		
		VehicleConvoy convoy = new VehicleConvoy(); convoy.addVehicle(batman);
		convoy.addVehicle(tuctuc); convoy.addVehicle(miniVan1);
		System.out.println("Convoy speed is " + convoy.getMaximalSpeed()); 
	}
}
