package builder;

/**
 * 潜克隆
 * @author 包华杰
 * 
 * 2018年7月2日
 */
public class Student implements Cloneable{
	
	private String name;
	private int age;
	private Teacher teacher;
	public Student() {
		super();
	}
	public Student(String name, int age, Teacher teacher) {
		super();
		this.name = name;
		this.age = age;
		this.teacher = teacher;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	@Override
	protected Object clone() {
		Student student=null;
		if(student==null){
			try {
				student=(Student) super.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		return student;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", teacher="
				+ teacher + "]";
	}
	
}
