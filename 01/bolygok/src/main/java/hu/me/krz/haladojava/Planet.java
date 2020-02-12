package hu.me.krz.haladojava;

public final class Planet {

	private final String position;
	private final int radius;
	private final String name;
	
	public Planet(String position, int radius, String name) {
		super();
		this.position = position;
		this.radius = radius;
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public int getRadius() {
		return radius;
	}

	public String getName() {
		return name;
	}
	
}
