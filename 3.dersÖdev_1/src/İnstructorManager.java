
public class �nstructorManager extends UserManager {

	public void al�nanDers(�nstructor instructor) {
		
		System.out.println(instructor.getAd());
		for(String kurs:instructor.kursAd) {
			
			System.out.println(" , "+kurs);
			
		}
		
		System.out.println(" kurs verildi");
	}
}
