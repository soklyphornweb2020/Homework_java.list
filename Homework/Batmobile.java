package Homework;

public class Batmobile extends Vechicle {
	

	boolean BatMobile;

	Batmobile(String plateID, float weight, boolean BatMobile ) {
		 
		this.plateID = plateID;
		this.weight = weight;
		this.BatMobile = BatMobile;
	}
	
	
	public String toString() {
		
		return "BatMobile " + plateID +", "+ weight;
		
	}


	@Override
	public int getMximalSpeed() {
		// TODO Auto-generated method stub
		int speed;
		if(BatMobile) {
			speed = 500;
		}else {
			speed=110;
		}
		return speed;
	}

}
