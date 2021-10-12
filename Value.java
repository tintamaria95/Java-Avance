package fr.dauphine.td2;

public class Value implements Expr {

	private double nb;

	public Value(double nb) {
		this.nb = nb;
	}
	
	public Value(Value val) {
		this.nb = val.nb;
	}

	@Override
	public double eval() {
		return nb;
	}

	@Override
	public void affichage() {
		System.out.println(nb);
	}

}
