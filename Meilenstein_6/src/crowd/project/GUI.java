package crowd.project;

import java.io.IOException;


public class GUI {

	public static void main(String [] args) throws IOException{
		System.out.println("CROWD-INNOVATION");
		System.out.println("VORSCHLAGS MODUL:");
		Control controlObject = new Control();
		controlObject.erstelleIdeenbeitrag();
	}
	
	public void zeigeIdeenbeitrag(String ideeBeitrag) {
		System.out.println("Ihr eingereichter Vorschlag:");
		System.out.println(ideeBeitrag);
	}

}