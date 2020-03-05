package hu.me.krz.haladojava;

public class Tanar extends Szemely implements Valogato{

	private float examAvg;

	public Tanar(String name, int age, float examAvg) {
		super(name, age);
		this.examAvg = examAvg;
	}

	@Override
	public boolean joAlanyE() {
		return (getAge() < 30 && examAvg >= 4.0);
	}

	@Override
	public String toString() {
		return "Tanar: vizsga atlag=" + examAvg + ", jo alanyE?=" + joAlanyE() + ", neve=" + getName() + ", eletkora="
				+ getAge();
	}
	
	
	
	
}
