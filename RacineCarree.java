package fr.dauphine.td2;

/**
 * RacineCarre est une classe qui hérite de Expr 
 * @see Eval
 * Donne la racine carrée
 *@author tinta 
 */
public class RacineCarree implements Expr{
	private Expr val;
	char c = '\u221a';
	
	/**
	 * Constructeur de la classe RacineCarree
	 * @param val
	 * 		la valeur de depart sur laquelle on va appliquer la racine carree
	 * 
	 */
	public RacineCarree(Expr val) {
		this.val = val;
	}
	
	/**
	 * Permet de calculer la valeur de la racine carree
	 * 
	 * @return la valeur de la racine carree
	 */
	@Override
	public double eval() {
		return Math.sqrt(val.eval());
	}
	
	/**
	 * Affiche l'expression arithmetique de racine carree non evaluee
	 */
	public void affichage() {
		System.out.println("Racine Carree: " + c + val.eval() + " = " + this.eval());
	}
}

