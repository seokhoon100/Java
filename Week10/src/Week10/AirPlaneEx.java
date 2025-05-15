package Week10;

public class AirPlaneEx {
	public void main(String[] args) {
		SonicAirPlane sPlane = new SonicAirplane();
		sPlane.takeoff();
		sPlane.fly();
		sPlane.land();
		
		sPlane.flyMode = SonicAirPlane.SUPERSONIC;
		sPlane.fly();
	}
}