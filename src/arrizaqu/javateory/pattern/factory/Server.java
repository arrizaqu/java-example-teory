package arrizaqu.javateory.pattern.factory;

public class Server implements MyComputer{

	public String type;
	public int ram;
	public int hdd;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "computer SERVER spec Type : " + this.type + ", ram : " + this.ram + "G" + ", Hdd : "+ this.hdd+"G";
	}
	
	public Server(String type, int ram, int hdd) {
		super();
		this.type = type;
		this.ram = ram;
		this.hdd = hdd;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	@Override
	public String getType(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRam(float ram) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHdd(float hdd) {
		// TODO Auto-generated method stub
		return 0;
	}
}
