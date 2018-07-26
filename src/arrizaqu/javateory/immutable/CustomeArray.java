package arrizaqu.javateory.immutable;

class Anu{
	public int a;
}

public class CustomeArray {
	
	int x = 5;
	int y = 5;
	
	public void example() {	
		String[][] data = new String[y][x];
		Integer b = 5;
		Anu anu = new Anu();
		anu.a = 67;
		String str = "wkwkwkw";
		
		for(int i = 0; i < y; i++) {
			for(int j=0; j< x; j++) {
				processing(data);
			}
		}
		
		print(data);
		angin(anu);
		yuklah(str);
		
		System.out.println("anu a : "+ anu.a);
		System.out.println("str : " + str);
	}
	
	public void print(String[][] data) {
		for(int i = 0; i < y; i++) {
			for(int j=0; j< x; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public Anu angin(Anu anu) {
		anu.a = 10;
		return anu;
	}
	
	public String yuklah(String ab) {
		return ab = "lupkanlah";
	}
	
	
	public String[][] processing(String[][] data) {
		data[3][3] = "5";
		
		return data;
	}
	
	
	public static void main(String[] args) {
		CustomeArray ca = new CustomeArray();
		ca.example();
	}

}
