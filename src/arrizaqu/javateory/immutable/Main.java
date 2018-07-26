package arrizaqu.javateory.immutable;

public class Main {

	public static void main(String[] args) {
		Age age = new Age();
		age.setDay(9);
		age.setMounth(12);
		age.setYear(1999);
		
		ImmutablePerson ip = new ImmutablePerson("arrizaqu@yahoo.com", "seputih banyak", age);
		age.setYear(2000);
		//ip.getAge().setYear(2010);
		
		System.out.println("name : "+ ip.getName());
		System.out.println("alamat : "+ ip.getAddress());
		System.out.println("tahun lahir : "+ ip.getAge().getYear());
	}
}
