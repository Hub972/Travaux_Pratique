public class Chirurgien extends Perso {

	public void combattre() {
		System.out.println("Je ne combat pas");

	}
	public void soigner() {
	if(this.sacDeSoin.equals("gros sac"))
		System.out.println("Je fais des merveilles");
	
	else
		System.out.println("Je fais des opération");
	}

}
