package personnages;

import java.util.Set;

import javax.sound.midi.SysexMessage;

import com.sun.javafx.collections.SetAdapterChange;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private int forcePotion = 1;
			
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}

	private String prendreParole() {
		return "Le Gaulois " + nom + " :";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force + effetPotion / 3);
	}

	@Override
	public String toString() {
		return "Gaulois [nom= " + nom + ", force= " + force + ", effetPotion= " + effetPotion + " ]";
	}
	public void boirePotion() {
		effetPotion=forcePotion;
		parler("Merci Druide, je sens que ma force est" + forcePotion+ " fois décuplée.");
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8);
		System.out.println(asterix);
		asterix.parler(" je suis le plus fort ");
	}
}
