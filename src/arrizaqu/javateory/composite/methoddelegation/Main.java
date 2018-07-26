package arrizaqu.javateory.composite.methoddelegation;

public class Main {

	ClassACrud a = new ClassACrud();
	ClassBCrud b = new ClassBCrud();
	ClassCCrud c = new ClassCCrud();
	
	public void delete() {
		a.delete();
	}
	public boolean equals(Object obj) {
		return a.equals(obj);
	}
	public int hashCode() {
		return a.hashCode();
	}
	public void save() {
		a.save();
	}
	public String toString() {
		return a.toString();
	}
	public void update() {
		a.update();
	}
	
	
}
