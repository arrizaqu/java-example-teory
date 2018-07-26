package arrizaqu.javateory.pattern.factory;

public class MyFactory {

	
	
	public static MyComputer getInstance(String type, int ram, int hdd) {
		MyComputer computer = null;
		if(type.equals("notebook")) {
			return computer = new Notebook(type, ram, hdd);
		} else if(type.equals("server")) {
			return computer = new Server(type, ram, hdd);
		}
		
		return null;
	}
	
}
