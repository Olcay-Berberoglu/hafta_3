
public class İnstructor  extends User{
	

	int egitmenNumber;
	String[] kursAd;
	
	public İnstructor() {
		
	}
	
public İnstructor(int egitmenNumber) {
	
	super();
	this.egitmenNumber=egitmenNumber;
	
		
	}



public İnstructor(String[] kursAd) {
	
	super();
	this.kursAd=kursAd;
	
		
	}

public int getEgitmenNumber() {
	return egitmenNumber;
}

public void setEgitmenNumber(int egitmenNumber) {
	this.egitmenNumber = egitmenNumber;
}

public String[] getKursAd() {
	return kursAd;
}

public void setKursAd(String[] kursAd) {
	this.kursAd = kursAd;
}



}
