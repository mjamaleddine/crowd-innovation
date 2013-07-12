package crowd.project;

public class Beitrag {
	public Vorschlag vorschlagObject;
	
	public Beitrag(){
		vorschlagObject = new Vorschlag();
	}

	public void addText(String aText) {
		vorschlagObject.addText(aText);
	}
}