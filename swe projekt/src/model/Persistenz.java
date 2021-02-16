package model;
import java.util.ArrayList;

public class Persistenz {
	
	ArrayList<Konto> konten = new ArrayList<Konto>();

	public Persistenz() {
		
		
	}
	
	public Konto selectKonto(int kontoNr) {
		
		for (Konto konto : konten) {
			
			
			if(konto.getKontoNr() == kontoNr) {
				return konto;
			}
			
			
		}
		
		
		return null;
		
	}
	
	public void buchenKonto(int kontoNr, double betrag) {
		
		for (Konto konto : konten) {
			
			
			if(konto.getKontoNr() == kontoNr) {
				
				konto.buchen(betrag);
				
				
			}
			
			
		}
		
		
		
	}
	
	
	
	
	
	

}
