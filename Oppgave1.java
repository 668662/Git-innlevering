package innlevering0909;

import static javax.swing.JOptionPane.*;



public class Oppgave1 {

	public static void main(String[] args) {
		
		showMessageDialog(null, "Sjekk din trinnskatt");
		String bruttoTxt = showInputDialog("Hva er din inntekt?: ");
		
		
		int brutto = Integer.parseInt(bruttoTxt);
		double trinnskatt = 0.0;
		double netto = 0.0;
		
		
		//trinn 0
		if (brutto >=0 && brutto <=164100) {
			trinnskatt = 0.0;
			netto = brutto;
		}
		//Trinn 1
		if (brutto >=190350 && brutto <=267899) {
			trinnskatt = 0.017;
			netto = brutto * trinnskatt;
		}
		//Trinn 2
		if (brutto >=267900 && brutto <=643799) {
			trinnskatt = 0.04;
			netto = brutto * trinnskatt;
		}
		//Trinn 3
		if (brutto >=643800 && brutto <=969199) {
			trinnskatt = 0.134;
			netto = brutto * trinnskatt;
		}
		//Trinn 4
		if (brutto >=969200 && brutto <=1999999) {
			trinnskatt = 0.164;
			netto = brutto * trinnskatt;
		}
		//Trinn 5
		if (brutto >=2000000) {
			trinnskatt = 0.174;
			netto = brutto * trinnskatt;
		}
		
		int netto1 = brutto - (int)netto;
		
		
		
		
		showMessageDialog(null, "Skatt: " + trinnskatt + "%");
		showMessageDialog(null, "trinnskatt betalt: " + (int)netto + "kr");
		showMessageDialog(null, "netto: " + netto1 + "kr");
		
	}

}
