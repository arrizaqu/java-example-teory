package arrizaqu.javateory.immutable;

public class ImmutablePerson {
	
	private final String name;
	private final String address;
	private final Age age;
	
	public ImmutablePerson(String name, String address, Age age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
		
		Age a = new Age();
		a.setDay(age.getDay());
		a.setMounth(age.getMounth());
		a.setYear(age.getYear());
		
		this.age = a;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Age getAge() {
		return age;
	}
	
}
