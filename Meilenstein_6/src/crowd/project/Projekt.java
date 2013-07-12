package crowd.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Projekt {
	public Beitrag beitragObject;
	public String vorschlagsBeitrag;
	private InputStreamReader isr = new InputStreamReader(System.in);
    private BufferedReader br = new BufferedReader(isr);
	
	public Projekt(){
		beitragObject = new Beitrag();
		
	}

	public void getProject() throws IOException {
		System.out.println("Bitte geben Sie ihren neuen Vorschlag ein:");
		vorschlagsBeitrag = br.readLine();
		beitragObject.addText(vorschlagsBeitrag);
	}

}