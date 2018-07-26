package arrizaqu.javateory.innerclass;

public class CarInner {
	
	private  Engine engine = new Engine("Mobil TERIOS X DELUX");
	
	public Engine getEngine() {
		return engine;
	}
	
	class Engine{
		
		private String vehicleName;
		
		public Engine(String vehicleName) {
			// TODO Auto-generated constructor stub
			this.vehicleName = vehicleName;
		}
		
		public void start() {
			starterON(this.vehicleName);
		}
		
		public void stop() {
			starterOFF(this.vehicleName);
		}
		
	}
	
	private void starterON(String vn) {
		System.out.println(vn + " engine is ON");
	}
	
	private void starterOFF(String vn) {
		System.out.println(vn + " engine is OFF");
	}
}
