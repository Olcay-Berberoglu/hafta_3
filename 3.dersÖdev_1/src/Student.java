
public class Student extends User {
	
	
	
	int ogrenciNumara;
	String [] alınanDers;
	
	



	public Student(int ogrenciNumarası) {
		
		super();
		this.ogrenciNumara=ogrenciNumarası;
		
	}
	
	
	public Student(int ogrenciNumarası,String[] alınanDers) {
		super();
		this.ogrenciNumara = ogrenciNumarası;
		this.alınanDers = alınanDers;
		 
	}
	
	public Student(String[] alınanDers) {
		
		super();
		this.alınanDers=alınanDers;	
	}
	
	
		public String[] getAlınanDers() {
		return alınanDers;
	}


	public void setAlınanDers(String[] alınanDers) {
		this.alınanDers = alınanDers;
	}


	public int getOgrenciNumara() { 
		return ogrenciNumara;
	}

}
