
public class ÝnstructorManager extends UserManager {

	public void alýnanDers(Ýnstructor instructor) {
		
		System.out.println(instructor.getAd());
		for(String kurs:instructor.kursAd) {
			
			System.out.println(" , "+kurs);
			
		}
		
		System.out.println(" kurs verildi");
	}
}
