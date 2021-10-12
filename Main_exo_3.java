package fr.dauphine.td2;

public class Main_exo_3 {

	public static void main(String[] args) {
		 Expr val = new Value(1337.0);
		 System.out.println(val.eval()); //affiche 1337.0
		 Expr add = new Add(new Value(327.0), val);
		 System.out.println(add.eval()); //affiche 1664.0
		 Expr e = new Add(new Value(350.0), add);
		 System.out.println(e.eval()); //affiche 2014.0
		 e.affichage();
		 Expr mul = new Multiplication(new Value(2), new Value(3));
		 mul.affichage();
		 Expr rac = new RacineCarree(new Value(9));
		 rac.affichage();
		 
	}

}
