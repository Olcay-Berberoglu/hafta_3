
public class Student extends User {
	
	
	
	int ogrenciNumara;
	String [] al�nanDers;
	
	



	public Student(int ogrenciNumaras�) {
		
		super();
		this.ogrenciNumara=ogrenciNumaras�;
		
	}
	
	
	public Student(int ogrenciNumaras�,String[] al�nanDers) {
		super();
		this.ogrenciNumara = ogrenciNumaras�;
		this.al�nanDers = al�nanDers;
		 
	}
	
	public Student(String[] al�nanDers) {
		
		super();
		this.al�nanDers=al�nanDers;	
	}
	
	
		public String[] getAl�nanDers() {
		return al�nanDers;
	}


	public void setAl�nanDers(String[] al�nanDers) {
		this.al�nanDers = al�nanDers;
	}


	public int getOgrenciNumara() { 
		return ogrenciNumara;
	}

}
