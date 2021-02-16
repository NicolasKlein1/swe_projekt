package model;
public class GiroKonto extends Konto{

	public GiroKonto(int kontoNr, double kontoStand, String kontoTyp) {
		super(kontoNr, kontoStand, kontoTyp);
	}

	@Override
	public String toString() {
		return "GiroKonto [" + super.toString() + "]";
	}

	
	

}
