package personnages;

public class Romain {
	private String nom;
	private int force, nb_trophees;
	private int effetPotion = 1;
	private int nbEquipement = 0;
	private Equipement[] equipements= new Equipement[2];
	private Equipement trophees[] = new Equipement[100];

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
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

	public void sEquiper(Equipement equip) {
		switch (nbEquipement) {
		case 2 :
			System.out.println(" Le soldat " + nom + "  est déjà bien protégé !");
			break;
		case 0 :
			setEquiper(equip);
			break;
		case 1:
			if ((equipements[0]).toString()== equip.toString()) {
				System.out.println(" Le soldat " + nom + "  possède deja un "+ equip.toString()+ " !");
			}
			else {
				setEquiper(equip);
			}break;
		}
	}
	public void setEquiper(Equipement equip) {
		this.equipements [nbEquipement]= equip;
		this.nbEquipement++;
		System.out.println(" Le soldat " + nom + "  s'équipe d'un " +  equip.toString() +" .");
	}
	public static void main(String[] args) {
		Romain Minus = new Romain("Minus", 6);
		Minus.parler("blabla");
		Minus.recevoirCoup(8);
		System.out.println(Equipement.Bouclier.toString() + Equipement.Casque.toString());
		Minus.sEquiper(Equipement.Casque);
		Minus.sEquiper(Equipement.Casque);
		Minus.sEquiper(Equipement.Bouclier);
		Minus.sEquiper(Equipement.Casque);
	}
}
