package personnages;

public class Village {
	private static final Chef Chef = null;
	private String nom;
	private Chef chef;
	int nbVillageois = 0;
	Gaulois[] villageois;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois villageois) {
		this.villageois[nbVillageois] = villageois;
		nbVillageois += 1;
	}

	public Gaulois trouverHabitant(int nbVillageois) {
		return villageois[nbVillageois];
	}

	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef + " vivent les légendaires gaulois : ");
		for (int i = 0; i <= nbVillageois; i++) {
			System.out.println("- " + trouverHabitant(i).getNom() + ".");
		}
	}

	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		// System.out.println(village);
		Gaulois Abraracourcix = new Gaulois("Abraracourcix", 8);
		// Gaulois gaulois = village.trouverHabitant(1);
		// System.out.println(gaulois);
		Gaulois Obélix = new Gaulois("Obélix", 25);
		village.afficherVillageois();
	}
}
