
public class İnstructorManager extends UserManager {

	public void alınanDers(İnstructor instructor) {
		
		System.out.println(instructor.getAd());
		for(String kurs:instructor.kursAd) {
			
			System.out.println(" , "+kurs);
			
		}
		
		System.out.println(" kurs verildi");
	}
}
