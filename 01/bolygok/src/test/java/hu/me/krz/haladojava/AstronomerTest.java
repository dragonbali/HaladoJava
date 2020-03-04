package hu.me.krz.haladojava;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;


public class AstronomerTest {
	
	@Test
	public void getName() {
		String name = "Vala Ki";
		Astronomer astronomer = new Astronomer(name);
		
		assertThat(astronomer.getName(), is(equalTo(name)));		
	}

	@Test
	public void getDiscoveredPlanets(){
	}

	@Test
	public void observeTheSky(){	
		String name = "V Ki";
		Astronomer astronomer = new Astronomer(name);
		
		astronomer.observeTheSky();
		
		assertThat(astronomer.getDiscoveredPlanets().size(), is(equalTo(10)));
		
		//assertThat(astronomer.getDiscoveredPlanets().get(0).getPosition(), is(equalTo(new Point(0,0,0))));
		assertThat(astronomer.getDiscoveredPlanets().get(0).getPosition(), is(equalTo(new Point(0,0,0))));
		
		
		assertThat(astronomer.getDiscoveredPlanets().get(0).getName(), is(equalTo(String.format("", name))));
	}
	
}
