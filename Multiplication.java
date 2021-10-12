package fr.dauphine.td2;

/**
 * Multiplication est une classe qui hérite de Expr 
 * @see Exp
 * Elle permet de donner la multiplication de deux nombres
 * 
 * @author tinta
 *
 */
public class Multiplication implements Expr{
	private Expr val1;
	private Expr val2;
	
	/**
	 * Constructeur de la classe Multiplication
	 * @param val1
	 * 		l'une des valeurs de depart sur lesquelles on va appliquer la multiplication
	 * @param val2
	 * 		l'autre valeur de depart sur laquelle on va appliquer la multiplication
	 * 
	 */
	public Multiplication(Expr val1, Expr val2) {
		// TODO Auto-generated constructor stub
		this.val1 = val1;
		this.val2 = val2;
	}
	
	/**
	 * Permet de calculer la valeur de la multiplication
	 * 
	 * @return la valeur de la multiplication
	 */
	@Override
	public double eval() {
		return this.val1.eval() * this.val2.eval();
	}
	
	/**
	 * Affiche l'expression arithmetique d'une multiplication non evaluee
	 */
	
	public void affichage() {
		System.out.println("Multiplication: " + val1.eval() + " * " + val2.eval() + " = " + this.eval());
	}
}

