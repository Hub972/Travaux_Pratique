public abstract class Perso {
	
	protected EspritCombatif espritCombatif = new Pacifiste();
	protected Soin soin = new AucunSoin();
	protected Deplacement deplacement = new Marcher();
	
	public Perso() {}
	
	public Perso(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement)
	{
		this.espritCombatif = espritCombatif;
		this.soin = soin;
		this.deplacement = deplacement;
	}
	public void seDeplacer() {
		((Marcher) deplacement).deplacer();
	}
	
	public void combattre() {
((Pacifiste) this.espritCombatif).combat();
	}
	public void soigner() {
		((AucunSoin) soin).soigner();
	}
	public void setEspritCombatif(EspritCombatif espritCombatif) {
		this.espritCombatif = espritCombatif;
	}
	public void setSoin (  Soin soin) {
		this.soin = soin;
	}
	public void setDeplacement(Deplacement deplacement) {
		this.deplacement = deplacement;
	}
	
