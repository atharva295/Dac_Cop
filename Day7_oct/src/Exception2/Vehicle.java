package Exception2;

public class Vehicle {
	private int speed =0 ;
	private int overSpeed= 80 ;
	
	public Vehicle() {
		
	}
	public int checkSpeed(int speed) {
		this.speed=speed;
		try {
			if(this.speed>overSpeed) {
				OverSpeedExc oc= new OverSpeedExc("you are driving faster");
				throw oc ;
			}
		} catch (OverSpeedExc oc) {
			oc.printStackTrace();
		}
		return speed ;
	}

}