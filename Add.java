package fr.dauphine.td2;

/**
 * Add est une classe qui hérite de Expr Elle permet de donner la somme de deux
 * nombres
 * 
 * @author tinta
 *
 */
public class Add implements Expr {
	private Value val1;
	private Expr val2;

	/**
	 * Constructeur de la classe Add
	 * 
	 * @param val1 l'une des valeurs de depart sur lesquelles on va appliquer
	 *             l'addition
	 * @param val2 l'autre valeur de depart sur laquelle on va appliquer l'addition
	 * 
	 */
	public Add(Value val1, Expr val2) {
		// TODO Auto-generated constructor stub
		this.val1 = val1;
		
		if (val2 instanceof Value) {
			this.val2 = (Value) val2;
		}
		if (val2 instanceof Add) {
			this.val2 = (Add) val2;
		}
	}

	/**
	 * Permet de calculer la valeur de la somme
	 * 
	 * @return la valeur de la somme
	 */
	@Override
	public double eval() {
		return this.val1.eval() + this.val2.eval();
	}

	/**
	 * Affiche l'expression arithmetique d'une somme non evaluee
	 */
	public void affichage() {
		System.out.println("Add: " + val1.eval() + " + " + val2.eval() + " = " + this.eval());
	}
}
