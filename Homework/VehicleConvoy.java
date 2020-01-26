package Homework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VehicleConvoy {

	List<Vechicle> listvehicle = new ArrayList<>();
	
	 public void addVehicle(Vechicle vehicle){

		 listvehicle.add(vehicle);
		
	}
	 
	@SuppressWarnings("unchecked")
	int getMaximalSpeed(){
		List speeds = new ArrayList<>();
		for(Vechicle speed : listvehicle ) {
			speeds.add(speed.getMximalSpeed());
			//System.out.println(speeds);
		}
		int lowest = 0;
		for(int i = 0; i < speeds.size(); i++) {
			lowest = (int) Collections.min(speeds);
		}
		return lowest;
		 
	 }
}
