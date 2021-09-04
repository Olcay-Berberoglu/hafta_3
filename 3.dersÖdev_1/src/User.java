
public class User {

	
	int id;
	String ad;
	String soyad;
	String kimlik;
	
	public User() {
		
		
	}
	
	public User(int id,String ad,String soyad,String kimlik) {
		
		super();
		this.id=id;
		this.ad=ad;
		this.soyad=soyad;
		kimlik=kimlik;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getKimlik() {
		return kimlik;
	}

	public void setKimlik(String kimlik) {
		this.kimlik = kimlik;
	}
	
	
	
}
