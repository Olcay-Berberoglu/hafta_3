
public class StudentManager {

	public void getKurs(Student student) {
		
		System.out.println(student.getAd());
		
		for (String kurs: student.alınanDers) {
			System.out.println(" , "+ kurs );
			
		} 
		
		System.out.println(" kurs alındı");
	}
}
