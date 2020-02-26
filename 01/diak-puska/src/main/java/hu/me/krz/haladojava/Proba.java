package hu.me.krz.haladojava;

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
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
