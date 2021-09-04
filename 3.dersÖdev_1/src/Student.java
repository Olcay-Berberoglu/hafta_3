
public class Student extends User {
	
	
	
	int ogrenciNumara;
	String [] alýnanDers;
	
	



	public Student(int ogrenciNumarasý) {
		
		super();
		this.ogrenciNumara=ogrenciNumarasý;
		
	}
	
	
	public Student(int ogrenciNumarasý,String[] alýnanDers) {
		super();
		this.ogrenciNumara = ogrenciNumarasý;
		this.alýnanDers = alýnanDers;
		 
	}
	
	public Student(String[] alýnanDers) {
		
		super();
		this.alýnanDers=alýnanDers;	
	}
	
	
		public String[] getAlýnanDers() {
		return alýnanDers;
	}


	public void setAlýnanDers(String[] alýnanDers) {
		this.alýnanDers = alýnanDers;
	}


	public int getOgrenciNumara() { 
		return ogrenciNumara;
	}

}
