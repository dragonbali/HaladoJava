import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NeptunCodeGeneratorTest {

	@Test
	public void getNextCounterTest(){
		NeptunCodeGenerator ncg = new NeptunCodeGenerator();
		
		assertEquals(0, ncg.getNextCounter()); //esloszor 0
		
		ncg.getNextCounter(); //most igy mar 1
		
		assertEquals(2, ncg.getNextCounter()); //itt meg mar 2
		
	}
	
}
