package arrizaqu.javateory.enumerasi;

public enum StopContact{
	ON("SYSTEM IS ON"),
	OFF("SYSTEM IS OFF"),
	SUSPEND("SYSTEM IS SUSPEND");
	
	private String description;
	
	private StopContact(String message) {
		this.description = message;
	}
}
