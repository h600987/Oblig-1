package o3;

import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;

public class O3 {

	public static void main(String[] args) {
		
		int fakultet = 1;
		
		String boks = JOptionPane.showInputDialog("Skriv inn tall som skal fakulteteres"); 
		int n = Integer.parseInt(boks);
		
		for(int i = n; i >0 ; i--) {
			fakultet = fakultet * i;
		}
		System.out.println (fakultet);

	}

}
