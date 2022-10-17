package personnages;

public class Romain {
	private String nom;
	private int force, nb_trophees;
	private int effetPotion = 1;
	private int nbEquipement = 0;
	Equipement[] equipements;
	private Equipement trophees[] = new Equipement[100];

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		equipements = new Equipement[2];
	}

	public String getNom() {
		return nom;
	}

	private String prendreParole() {
		return "Le Romain" + nom + ":";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0;
		int oldforce = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe !");
		} else {
			parler("J'abandonne...");
		}
		assert oldforce > force;
	}

	public void sEquiper(int nbEquipement) {
		if (nbEquipement > 2) {
			System.out.print("Le soldat " + nom + " est deja bien protégé !");
		} else if (Equipements[nbEquipement] == Equipement.Bouclier) {
			System.out.print("Le soldat " + nom + " possède deja un bouclier !");
		} else if (Equipements[nbEquipement] == Equipement.Casque) {
			System.out.print("Le soldat " + nom + " possède deja un casque !");
		} else {
			this.equipements[nbEquipement] = Equipement;
			nbEquipement++;
			System.out.print("Le soldat " + nom + " s'équipe d'un " + Equipement);
		}
	}

	public static void main(String[] args) {
		Romain Minus = new Romain("Minus", 6);
		Minus.parler("blabla");
		Minus.recevoirCoup(8);
		System.out.println(Equipement.Bouclier, Equipement.Casque);
	}
}
