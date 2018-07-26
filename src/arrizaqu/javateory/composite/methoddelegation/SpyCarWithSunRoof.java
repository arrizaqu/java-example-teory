package arrizaqu.javateory.composite.methoddelegation;

public class SpyCarWithSunRoof {

	private BasicCar car = new BasicCar();
	private SpyCarAddon spyCarAddon = new SpyCarAddon();
	private SunRoofAddon rootAddon = new SunRoofAddon();
	public void start() {
		car.start();
	}
	public void shootRockets() {
		spyCarAddon.shootRockets();
	}
	public void openSunRoof() {
		rootAddon.openSunRoof();
	}
	public void closeSunRoof() {
		rootAddon.closeSunRoof();
	}
	
	
}
