
public class StudentManager {

	public void getKurs(Student student) {
		
		System.out.println(student.getAd());
		
		for (String kurs: student.al�nanDers) {
			System.out.println(" , "+ kurs );
			
		} 
		
		System.out.println(" kurs al�nd�");
	}
}
