package hu.me.krz.haladojava;

public class Diak extends Szemely implements Comparable<Diak> {
	
	private int puskakSzama;

	public Diak(String name, int age, int puskakSzama) {
		super(name, age);
		this.puskakSzama = puskakSzama;
	}

	@Override
	public int compareTo(Diak o) {
		if (o.puskakSzama < this.puskakSzama) return -1; 	//ha kevesebb puskaja van negativval ter vissza
		if (o.puskakSzama > this.puskakSzama) return 1;	    //ha tobb puskaja van pozitivval ter vissza
		else return 0;										//ha ugyan annyi akkor 0-val
	}

	@Override
	public String toString() {
		return "Diak: Neve: " + getName() + ", eletkora: " + getName() + ", puskainak a szama: " + puskakSzama;	
	}
	
}
