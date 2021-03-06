package hu.me.krz.haladojava;

public final class Planet {

	private final Point position;
	private final int radius;
	private final String name;
	
	public Planet(Point position, int radius, String name) {
		super();
		this.position = position;
		this.radius = radius;
		this.name = name;
	}

	public Point getPosition() {
		return position;
	}

	public int getRadius() {
		return radius;
	}

	public String getName() {
		return name;
	}
	
}
