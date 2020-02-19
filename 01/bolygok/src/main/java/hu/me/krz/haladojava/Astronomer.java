package hu.me.krz.haladojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Astronomer {
	private String name;
	private List<Planet> discoveredPlanets;
	public Astronomer(String name) {
		super();
		this.name = name;
		discoveredPlanets = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	
	public List<Planet> getDiscoveredPlanets() {
		return discoveredPlanets;
	}

	public void observeTheSky() {
		for (int i = 0; i < 10; i++) {
			double radian = new Random().nextInt(1000000);
			String name = this.name + "_" + (i);
			Point position = new Point((i + 1) * 10, 0, 0);		
			discoveredPlanets.add(new Planet(pos, rad, name));
		}
	}
	
}