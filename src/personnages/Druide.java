package personnages;

import java.util.Random;
import java.util.Set;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionmin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMax = effetPotionMax;
		this.effetPotionMin = effetPotionmin;
		parler("Bonjour, je suis le druide" + nom + "et ma potion peut aller d'une force " + effetPotionmin + "à"
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	private String prendreParole() {
		return "Le druide" + nom + ":";
	}
	public void preparerPotion() {
		Random random= new Random();
		forcePotion= random.nextInt(effetPotionMax);
		if (forcePotion > 7) {
			parler("j'ai preparer une super potion de force" + "" + forcePotion);
		} else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force" + forcePotion);
		}
	}
	public static void main(String[] args) {
		Druide paronamix= new Druide("paronamix", 5,10);
		paronamix.preparerPotion();
	}
}
