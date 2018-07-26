package arrizaqu.javateory.enumerasi;

public class Main {

	public static StopContact stopContact = StopContact.OFF;
	
	public static void main(String[] args) {
		NightOperation no = new NightOperation();
		no.setSwitchOn(stopContact);
		
		if(no.getSwitchOn() == StopContact.ON) {
			System.out.println("stop contact sudah ON");
		} else if(no.getSwitchOn() == StopContact.SUSPEND){
			System.out.println("SYSTEM still suspend");
		}else {
			System.out.println("system is OFF");
		}
		
		System.out.println(StopContact.ON);
		
	}
}
