package histoire;

import personnages.Gaulois;
import personnages.Romain;
public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Asterix",10);
		Romain Minus = new Romain ("Minus",8);
		asterix.parler("Bonjour a tous");
		Minus.parler("un Gau...UN GAUGAU");
		asterix.frapper(Minus);
	}
}
