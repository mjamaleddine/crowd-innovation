package crowd.project;

import java.io.IOException;


public class Control {
	public Projekt projectObject;
	public Datenbank dbObject;
	public GUI guiObject;

	public Control(){
		projectObject = new Projekt();
		dbObject = new Datenbank();
		guiObject = new GUI();
	}
	
	public void erstelleIdeenbeitrag() throws IOException {
		projectObject.getProject();
		dbObject.saveVorschlag();
		guiObject.zeigeIdeenbeitrag(projectObject.vorschlagsBeitrag);
	}

}