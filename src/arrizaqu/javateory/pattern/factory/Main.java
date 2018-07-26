package arrizaqu.javateory.pattern.factory;

public class Main {

	MyComputer mc;
	
	public void execute() {
		mc = MyFactory.getInstance("server", 2, 1000);
		System.out.println(mc);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.execute();
	}
}
