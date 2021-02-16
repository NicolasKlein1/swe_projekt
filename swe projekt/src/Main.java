import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import model.GiroKonto;
import model.Konto;
import model.SparKonto;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("SparKonto ----------------------------------------------");
		SparKonto sk = new SparKonto(1, 1000, "SparKonto");
		
		sk.buchen(-2000);
		
		
		System.out.println("GiroKonto ----------------------------------------------");
		Konto gk = new GiroKonto(2, 2000, "GiroKonto");
		Konto gk2 = new GiroKonto(3, 1500, "GiroKonto");
		Konto gk3 = new GiroKonto(4, 200, "GiroKonto");
		
		gk.buchen(20);
		
		
		
		ArrayList<Konto> test = new ArrayList<Konto>();
		test.add(gk);
		test.add(sk);
		test.add(gk2);
		test.add(gk3);
		
		
		for (Konto konto : test) {
			System.out.println(konto.getKontoNr());
		}
		
		
		
		System.out.println(test.toString());
		
		

	}

}
