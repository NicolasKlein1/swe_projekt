
public class SparKonto extends Konto{

	public SparKonto(int kontoNr, double kontoStand, String kontoTyp) {
		super(kontoNr, kontoStand, kontoTyp);
		
		
		
		
	}

	@Override
	public String buchen(double betrag) {

		System.out.println(betrag);
		
		
		
		if(getKontoStand() + betrag < 0) {
			System.out.println("Sparkonten dürfen nicht negativ bebucht werden.");
			
			return "Sparkonten dürfen nicht negativ bebucht werden.";
			
		} else {
			super.setKontoStand(getKontoStand() + betrag);
			System.out.println(getKontoStand());
			
			
			
		}
		
		
		
		return null;
		
	}

}
