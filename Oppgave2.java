package innlevering0909;

import static javax.swing.JOptionPane.*;


public class Oppgave2 {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
		
		String poeng = showInputDialog("Hvor mange poeng fikk eleven?: ");
		
		int karakter = Integer.parseInt(poeng);
		
		if(karakter<0) {
			System.out.print("Tast inn gyldig antall poeng!");
			i--;
			
		}
		if(karakter<=39) {
			System.out.println("Karakter: F");
			
		}
		if(karakter>=40 && karakter<=49) {
			System.out.println("Karakter: E");
			
		}
		if(karakter>=50 && karakter<=59) {
			System.out.println("Karakter D");
			
		}
		if(karakter>=60 && karakter<=79) {
			System.out.println("karakter C");
			
		}
		if(karakter>=80 && karakter<=89) {
			System.out.println("karakter B");
			
		}
		if(karakter>=90 && karakter<=100) {
			System.out.println("karakter A");
			
		}
		
		if(karakter>100) {
			System.out.print("Oi det var vel litt for mange poeng! \nTast inn på nytt");
			i--;
		
		}
		
		
		
		}
		
		
	}
}
