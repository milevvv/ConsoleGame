import java.util.Random;

public class Igra {
	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
			
		for(int n=0; n < 25; n++) {
			int p1r = r.nextInt(1, 10);
			int rez1 = 0;
			int rez2 = 0;
				 
				 
				 
				 
				 
			System.out.println(p1r+ "                                          ");	 
			System.out.println("                     " +rez1+":"+rez2 + "            ");
			System.out.println("--------                             --------");
			System.out.println("|                                           |");
			System.out.println("|       *                            *      |");
			System.out.println("|      /|\\                          /|\\     |");
			System.out.println("|       |                            |      |");
			// най-долен ред
			System.out.print("|      / \\");
			for(int i =0; i<25; i++) {
				if (n == i) {
					System.out.print("o");
				}else if(n != i){
					System.out.print(" ");
				}
			}
			System.out.println(" / \\     |");
			// до тук
			
			System.out.println("|___________________________________________|");
			Thread.sleep(50);
			
			
			rez1++;
		}
		for(int n=25; n > 0; n--) {
			int p2r = r.nextInt(1, 10);
			
				 
			int rez1 = 0;
			int rez2 = 0;
				 
				 
				 
				 
			System.out.println("                                          " + p2r);	 
			System.out.println("                     " +rez1+":"+rez2 + "            ");
			System.out.println("--------                             --------");
			System.out.println("|                                           |");
			System.out.println("|       *                            *      |");
			System.out.println("|      /|\\                          /|\\     |");
			System.out.println("|       |                            |      |");
			// най-долен ред
			System.out.print("|      / \\");
			for(int i =0; i<25; i++) {
				if (n == i) {
					System.out.print("o");
				}else if(n != i){
					System.out.print(" ");
				}
			}
			System.out.println(" / \\     |");
			// до тук
			
			System.out.println("|___________________________________________|");
			Thread.sleep(50);
		
			rez2++;	
		}
		 
		//Igrachi g1 = new Igrachi("Cristiano Ronaldo", "Nike Zoom Mercurial Dream Speed Superfly 9 Elite FG", 7, 1.87, 37);
		//Igrachi g2 = new Igrachi("Lionel Messi", "Adidas X SPEEDPORTAL MESSI.1 FG", 10, 1.70, 34); 
		//Igrachi g3 = new Igrachi("Neymar Jr", "Puma Future Ultimate", 11, 1.75, 31);
		//Igrachi g4 = new Igrachi("Sadio Mane", "New Balance Furon v6+", 17, 1.74, 30);
		
		 
		 
		// String g1Ime = g1.getIme();
		// System.out.println(g1Ime);
		
		// int g1Godini = g1.getGodini();
		// System.out.println(g1Godini); 
		 
		// int g1Nomer = g1.getNomer();
		// System.out.println(g1Nomer);
		 
		// double g1Visochina = g1.getVisochina();
		// System.out.println(g1Visochina);
		 
		// String g1Butonki = g1.getButonki();
		// System.out.println(g1Butonki);
		     
		   
			
		
		        			
		        	
				
				
				
				
		
		         
		         
	}
}