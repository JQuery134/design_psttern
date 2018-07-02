package builder;

public class Teacher implements Cloneable{

	private String name;
	private String couse;
	public Teacher() {
		super();
	}
	public Teacher(String name, String couse) {
		super();
		this.name = name;
		this.couse = couse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCouse() {
		return couse;
	}
	public void setCouse(String couse) {
		this.couse = couse;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", couse=" + couse + "]";
	}
}
