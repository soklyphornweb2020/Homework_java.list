package Homework;

public class MiniVan extends Vechicle {
	
	int nbCustomer;
	
	MiniVan(String plateID, float weight, int nbCustomer ) {
		
		this.plateID = plateID;
		this.weight = weight;
		this.nbCustomer = nbCustomer;
	}
	
	public int getMaximalSpeed1() {
		
		int maxismalSpeed = 130;
		int result = 0;
		if(nbCustomer !=0) {
			result = maxismalSpeed -10 * nbCustomer;
		}
		return result;
		
	}
	
	public String toString() {
		
		return "MiniVan " + plateID +", "+ weight;
		
	}

	@Override
	public int getMximalSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}
}
