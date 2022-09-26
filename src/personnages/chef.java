package personnages;

public class chef {
	private String nom;
	private int force;
	private int effetPotion=1;
	private Village village;
	
	public Chef (String nom, int force, Village village) {
		this.nom=nom;
		this.force=force;
		this.village=village;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	public String prendreParole() {
		return "le chef" + nom + "du village" + village.getNom() + ":" ;
	}
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la m�choire de " + romain.getNom());
		romain.recevoirCoup(force/3);
	}
}