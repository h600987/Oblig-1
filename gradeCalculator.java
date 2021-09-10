package gradeCalculator;
import static javax.swing.JOptionPane.*;
public class gradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=10; i++) {
		
String antallPoeng = showInputDialog("Skriv inn poengsum");
int poengSum = Integer.parseInt(antallPoeng);


if (poengSum >=0 && poengSum <=39) {
	showMessageDialog(null, "Grattis, du har greid å få en F");
}
else if (poengSum >=40 && poengSum <=49) {
	showMessageDialog(null, "Du bestod, men det var så vidt. Karakter E");
}
else if (poengSum >=50 && poengSum <=59) {
	showMessageDialog(null, "Karakter D");
}
else if (poengSum >=60 && poengSum <=79) {
	showMessageDialog(null, "Karakter C");
}
else if (poengSum >=80 && poengSum <=89) {
	showMessageDialog(null, "Solid - close, but no cigar. Karakter B");
}
else if (poengSum <=100 && poengSum >=90){
	showMessageDialog(null, "Imponerende. Dette kan du. Karakter A");
}
	else  {
		showMessageDialog(null, "Sum er feil, prøv igjen");
		i--;
	}
}
}
	}
	


