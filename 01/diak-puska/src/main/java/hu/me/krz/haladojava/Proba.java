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
			
			Diak[] diakokTomb = new Diak[parameter];
			for (int i = 0; i < diakokTomb.length; i++) {
				diakokTomb[i] = new Diak("diak" + i + 1 , new Random().nextInt(8) + 11, new Random().nextInt(6));
			}
			
			sortByPuska(diakokTomb);
			
			for (int i = 0; i < diakokTomb.length; i++) {
				System.out.println(diakokTomb[i].toString());
			}
							
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	} 

	private static Diak[] sortByPuska(Diak[] diakokTomb) {
		int swap;
		do {
			swap = 0;
			for (int i = 0; i < diakokTomb.length; i++) {
				if (diakokTomb[i].compareTo(diakokTomb[i + 1]) == -1 ) {
					Diak temp = diakokTomb[i];
					diakokTomb[i] = diakokTomb[i + 1];
					diakokTomb[i + 1] = temp;
					swap++;
				}
			}
		} while (swap == 0);
		
		return diakokTomb;
	}

}
