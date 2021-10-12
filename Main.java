package fr.dauphine.td2;

import java.io.IOException;

class Mere {
	public void a() {
		System.out.println("Mere_a");
	}

	void b(Fille fille) {
		System.out.println("Mere_b(Fille)");
	}

	void c() {
		System.out.println("Mere_c");
	}

	void c(Mere mere) {
		System.out.println("Mere_c(Mere)");
	}

	static void d() {
		System.out.println("static Mere_d");
	}

	protected void e() {
		System.out.println("Mere_e");
	}

	private void f() {
		System.out.println("Mere_f");
	}

	public void printF() {
		f();
	}

	Object g() {
		System.out.println("Mere_g");
		return 2;
	}

	char h() {
		System.out.println("Mere_h");
		return 2;
	}

	void i() {
		System.out.println("Mere_i");
	}

	void j() throws Exception {
		System.out.println("Mere_j");
	}

	void k() throws IOException, Exception {
		System.out.println("Mere_k");
	}

	void l() throws Exception {
		System.out.println("Mere_l");
	}

	void m() throws Exception, ArrayIndexOutOfBoundsException {
		System.out.println("Mere_m");
	}
}

class Fille extends Mere {
	void miage() {
		System.out.println("Miage");
	}

	public void a() {
		System.out.println("Fille_a");
	}

	protected void b(Fille fille) {
		System.out.println("Fille_b(Fille)");
	}

	public void c(Mere mere) {
		System.out.println("Fille_c(Mere)");
	}

	void c(Fille b) {
		System.out.println("Fille_c(Fille)");
	}

	static void d() {
		System.out.println("static Fille_d");
	}

	static void d(Mere mere) {
		System.out.println("Fille_d(Mere)");
	}

	protected void e() {
		System.out.println("Fille_e");
	}

	protected void f() {
		System.out.println("Fille_f");
	}

	String g() {
		System.out.println("Fille_g");
		return "c";
	}

	char h() {System.out.println("Fille_h"); return 'c';}

	void i() {
		System.out.println("Fille_i");
		//return 3;
	}

	void j() throws IOException {
		System.out.println("Fille_j");
	}

	void k() throws Exception {
		System.out.println("Fille_k");
	}

	void l() {
		System.out.println("Fille_l");
	}

	void m() throws IOException, IllegalArgumentException {
		System.out.println("Fille_m");
	}
}

public class Main {
	public static void main(String[] args) throws Exception {
		Mere mere = new Mere();
		Mere mereFille = new Fille();
		Fille fille = new Fille();

		//mere.miage();
		fille.miage(); // output : Miage ; Appel de la fonction miage() de la classe Fille
		//mereFille.miage();
		((Fille) mereFille).miage(); // output : Miage ; Appel de la fonction miage() de la classe Fille via casting

		mere.a(); // output : Mere_a ; Appel de la fonction a() de la classe Mere
		mereFille.a(); // output : Fille_a ; Appel de la fonction a() de la classe Fille, polymorphisme implique utilisation de la méthode fille
		fille.a(); // output : Fille_a ; Appel de la fonction a() de la classe Fille
		((Mere) mereFille).a(); // output : Fille_a ; Appel de la fonction a() de la classe Fille (polymorphisme fait qu'on a accès à la méthode de la classe fille malgré le casting)
		mereFille.b(null); // output : Fille_b(Fille); Appel de la fonction b() de la classe Fille (polymorphisme fait qu'on a accès à la méthode de la classe fille malgré le casting)

		mereFille.c(); // output : Mere_c ; méthode uniquement présente dans la classe mère donc appelle de la méthode c() de la classe Mere
		mereFille.c(mere); // output : Fille_c(Mere) ; Surchage de la méthode c() dans la classe fille
		mereFille.c(mereFille); // output : Fille_c(Mere) ; Surchage de la méthode c() dans la classe fille
		mereFille.c(fille); // output : Fille_c(Mere) ; Surchage de la méthode c() dans la classe fille, première méthode appelée ?
		fille.c(fille); // output : Fille_c(Fille) ; 

		mere.d(); // output : static Mere_d ; pas de polymorphisme avec les méthodes static
		mereFille.d(); // output :static Mere_d ; pas de polymorphisme avec les méthodes static

		mere.printF(); // output : Mere_f ; appel de la fonction printF de la classe mère -> liaison avec la méthode f() de la classe mère.
		mereFille.printF(); // output : Mere_f ; appel de la fonction printF de la classe mère -> liaison avec la méthode f() de la classe mère.

		mereFille.j(); // output : Fille_j ; polymorphisme, appel de la fonction fille j().
		mereFille.k(); // output : Fille_k ; polymorphisme, appel de la fonction fille k().
		mereFille.l(); // output : Fille_l ; polymorphisme, appel de la fonction fille l().
		mereFille.m(); // output : Fille_m ; polymorphisme, appel de la fonction fille m().
	}
}
