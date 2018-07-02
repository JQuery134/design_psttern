package builder;

public class Main {
	
	public static void main(String[] args) {
		Teacher teacher=new Teacher("t1","英语");
		Teacher teacher2=new Teacher("t2","英语2");
		Student s1=new Student("张三",23,teacher);
		
		System.out.println(s1.toString());
		
		Student clone = (Student) s1.clone();
		clone.setName("李四");
		clone.setAge(45);
		clone.setTeacher(teacher2);
		System.out.println(clone);
		
		
	}

}
