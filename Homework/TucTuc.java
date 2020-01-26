package Homework;

public class TucTuc extends Vechicle{
	
	int nbCustomer;
	
	TucTuc(String plateID, float weight, int nbCustomer ) {
		
		this.plateID = plateID;
		this.weight = weight;
		this.nbCustomer = nbCustomer;
	}
	
	public int getMaximalSpeed() {
		
		int maxismalSpeed = 130;
		int result = 0;
		if(nbCustomer != 0) {
			result = maxismalSpeed -5 * nbCustomer;
		}
		return result;
		
	}
	
	public String toString() {
		
		return "TucTuc " + plateID + " " + weight;
		
	}

	@Override
	public int getMximalSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

}
