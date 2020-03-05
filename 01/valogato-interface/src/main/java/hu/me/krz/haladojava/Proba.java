package hu.me.krz.haladojava;

import java.util.Random;

public class Proba {

	public static void main(String[] args) {
		
		if (args.length > 1) {
			System.err.println("Tobb parametert adott at!");
			System.exit(-1);
		}
	
		int parameter;
		
		try {
			parameter = Integer.parseInt(args[0]);
			// Nem tudom hogy kell hogy tanar is legyen benne meg diak is.
			Diak[] szemelyArray = new Diak[parameter];
			
			for (int i = 0; i < szemelyArray.length; i++) {
				szemelyArray[i] = new Diak("Some Body" + (i + 1), new Random().nextInt(5) + 15 , new Random().nextInt(6));
				if (szemelyArray[i].joAlanyE()) System.out.println(szemelyArray[i].toString());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
