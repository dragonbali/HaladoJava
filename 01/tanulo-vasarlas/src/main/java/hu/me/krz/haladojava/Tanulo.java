package hu.me.krz.haladojava;

public class Tanulo {

	protected final String nev;
	protected int penz;
	
	private static int tanulok;

	public static int osszestanulo() {
		return tanulok;
	}

	public int penz() {
		return penz;
	}

	public Tanulo(String nev, int penz) {
		super();
		this.nev = nev;
		this.penz = penz;
		tanulok++;
	}
	
	public Tanulo(String nev) {
		this(nev, 10000);
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		tanulok--;
	}

	@Override
	public String toString() {
		return "Tanulo: [nev= " + nev + " ]" + penz + " Ft;";
	}
	
	public boolean fogyasztas(int terheles) {
		penz =- terheles;
		if (penz <=  0) return true;	
		return false;
	}
	
}
