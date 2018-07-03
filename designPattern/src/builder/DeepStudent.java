package builder;

/**
 * 深克隆
 * @author 包华杰
 * 
 * 2018年7月2日
 */
public class DeepStudent implements Cloneable{
	
	private String name;
	private int age;
	private Teacher teacher;
	public DeepStudent() {
		super();
	}
	public DeepStudent(String name, int age, Teacher teacher) {
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
		DeepStudent student=null;
		if(student==null){
			try {
				student=(DeepStudent) super.clone();
				Teacher t=this.getTeacher().clone();
				student.setTeacher(teacher);
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
