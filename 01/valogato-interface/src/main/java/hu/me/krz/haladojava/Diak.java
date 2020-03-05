package hu.me.krz.haladojava;

public class Diak extends Szemely implements Valogato {

	private int cheatSheet;

	public Diak(String name, int age, int cheatSheet) {
		super(name, age);
		this.cheatSheet = cheatSheet;
	}

	@Override
	public boolean joAlanyE() {
		return cheatSheet == 0;
	}

	@Override
	public String toString() {
		return "Diak: Puskak= " + cheatSheet + ", jo alany?= " + joAlanyE() + ", neve= " + getName()
				+ ", eletkora= " + getAge();
	}
	
	
	
	
}
