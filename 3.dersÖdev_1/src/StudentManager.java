
public class StudentManager {

	public void getKurs(Student student) {
		
		System.out.println(student.getAd());
		
		for (String kurs: student.alưnanDers) {
			System.out.println(" , "+ kurs );
			
		} 
		
		System.out.println(" kurs alưndư");
	}
}
