import static javax.swing.JOptionPane.*;
public class incomeTaxCalculator {
	public static void main(String args[]){
		
String lønn = showInputDialog("Skriv inn bruttoinntekt");
int bruttoLønn = Integer.parseInt(lønn);

System.out.println("Bruttoinntekt" + bruttoLønn + "kr");

int skattefriLønn = 164100;
double trinn0 = 0.00;
double trinn1 = 0.0093;
double trinn2 = 0.0241;
double trinn3 = 0.1152;
double trinn4 = 0.1452;

if (bruttoLønn <= 164100) {
	double skattetrinn = trinn0;
	double skatt = skattetrinn*bruttoLønn;
showMessageDialog(null,"Total skatt i kroner "+skatt);}

else if (bruttoLønn <= 230950) {
	double skattetrinn = trinn1;
	double skatt = skattetrinn*(bruttoLønn-164100);
showMessageDialog(null,"Total skatt i kroner "+skatt);}

else if (bruttoLønn <= 580650) {
	double skattetrinn = trinn2;
	double skatt = (skattetrinn*(bruttoLønn-230950))+(trinn1*(230950-164100));
	showMessageDialog(null,"Total skatt i kroner "+skatt);}

else if (bruttoLønn <= 934050) {
	double skattetrinn = trinn3;
	double skatt = (skattetrinn*(bruttoLønn-580650))+(trinn2*(580650-230950))+(trinn1*(230950-164100));
	showMessageDialog(null,"Total skatt i kroner "+skatt);}

else {
	double skattetrinn = trinn4;
	double skatt = (skattetrinn*(bruttoLønn-934051))+(trinn3*(934051-580650))+(trinn2*(580650-230950))+(trinn1*(230950-164100));
	showMessageDialog(null,"Total skatt i kroner "+skatt);}


	
}
		
		
}
