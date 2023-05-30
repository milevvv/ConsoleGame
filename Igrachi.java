public class Igrachi {
// nai otgore sa poletata vinagi
	private String ime;
	private String butonki;
	private int nomer;
	private double visochina;
	private int godini;
	
	
	// konstruktori
	public Igrachi(){}
	
	public Igrachi(int g){
	 godini = g; 
	}
		
    public Igrachi(String i, String b, int n, double v, int g) {
		ime = i;
		butonki = b;
		nomer = n;
		visochina = v;
		godini = g;
	}
    // getter-i
    public String getIme() {
    	return ime;
    }
    
    public String getButonki() {
    	return butonki;
    }
    
    public int getNomer() {
    	return nomer;
    }
    
    public int getGodini() {
    	return godini;
    }
    
    public double getVisochina() {
    	return visochina;
    }
    
    //setter=-i
    public void setGodini(int g) {
    	if (g>=17 && g<=99) {
    		godini = g;
    	}
    }
    
    public void setNomer(int n) {
    	if (n>0 && n<=99) {
    		nomer = n;
    	}
    }
    
    public void setVisochina(double v) {
    	if (v>=1.50 && v<=2.20) {
    		visochina = v;
    	}
    }
    
    
    
    // drugi metodi
    public void print() {
    	
    	
    }
	
    }
