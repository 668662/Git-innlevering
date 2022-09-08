package innlevering0909;

import static javax.swing.JOptionPane.*;


public class Oppgave3 {

	public static void main(String[] args) {
		
		String fakultetTxt = showInputDialog("regn ut fakultetet av: ");
		int fakultet = Integer.parseInt(fakultetTxt);
		
		if (fakultet >= 34) {
			
			System.out.println("tallet er for hoyt, sjekk google");
			return;
		}
		
		int fakultetutregning = 1; 
		
		
			
		while (fakultet > 1) {
			fakultetutregning *= fakultet;
			fakultet--;
		}
		
		
		
		System.out.println("fakultet av " + fakultetTxt + "!" + " er " + fakultetutregning);
		
		
	}

}
