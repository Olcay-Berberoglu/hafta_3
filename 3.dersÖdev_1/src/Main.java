
public class Main {

	public static void main(String[] args) {
	
		�nstructor instructor=new �nstructor(new String [] {"C++","C"});
		
		instructor.setId(1);
		instructor.setAd("ahmet");
		instructor.setSoyad("sen");
		instructor.setKimlik("1232");
		instructor.setEgitmenNumber(1);
		
		
   Student student =new Student(new String [] {"C++","C"});
		
		student.setId(1);
		student.setAd("ali");
		student.setSoyad("veli");
		student.setKimlik("35423");
		
		
		
		

		UserManager userManager=new UserManager();
		
		userManager.addUser(student);
		userManager.addUser(instructor);

		StudentManager studentManager=new StudentManager();
		studentManager.getKurs(student);
		
		�nstructorManager instructorManager=new �nstructorManager();
		instructorManager.al�nanDers(instructor);
		
		
		
	}

}
