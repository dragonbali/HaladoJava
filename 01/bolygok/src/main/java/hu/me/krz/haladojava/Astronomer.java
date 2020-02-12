package hu.me.krz.haladojava;

import java.util.*;

public class Astronomer {

	private String name;
	private List<Planet> DiscoveredPlanets = new ArrayList<>();
	
	public Astronomer(String name) {
		super();
		this.name = name;
	}

	public List<Planet> getDiscoveredPlanets() {
		return DiscoveredPlanets;
	}
	
	
}
