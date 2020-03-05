package hu.me.krz.haladojava;

import java.util.ArrayList;
import java.util.Random;

public class Vasarlas {

	public static void main(String[] args) {

		ArrayList<Tanulo> tanulokTomb = new ArrayList<Tanulo>();
		
		for (int i = 0; i < 5; i++) {
			tanulokTomb.add(new Tanulo("tanulo" + i));
		}
		
		for (int i = 0; i < 6; i++) {
			int sum = 0;;
			for (Tanulo tanulo : tanulokTomb) {
				if (tanulo.fogyasztas(new Random().nextInt(1501)+1501)) {
					//tanulokTomb.remove(tanulo);
					try {
						tanulo.finalize();
					} catch (Throwable e) {
						e.printStackTrace();
					}
				}
				else {
					sum = tanulo.penz;
				}
			}
			
			System.out.println("atlag penz a " + i + ". vasarlas utan: " + sum / Tanulo.osszestanulo());			
		}
		
		System.out.println("ennyi tanulo maradt: " + Tanulo.osszestanulo());
		for (Tanulo tanulo : tanulokTomb) {
			System.out.println(tanulo.toString());
		}
	}

}
