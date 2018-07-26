package arrizaqu.javateory.singletonpattern;

public class SingletonClass {

	private static SingletonClass singletonClass = new SingletonClass();
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getIntance() {
		return singletonClass;
	}
}
