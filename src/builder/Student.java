package builder;

public class Student {

	// required parameters
	private String id;
	private String name;
	private String classname;
	private int age;
	// optional parameters
	private String address;
	private String phone;

	public Student(StudentBuilder studentBuilder) {
		super();
		this.id = studentBuilder.id;
		this.name = studentBuilder.name;
		this.classname = studentBuilder.classname;
		this.age = studentBuilder.age;
		this.address = studentBuilder.address;
		this.phone = studentBuilder.phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", classname=" + classname + ", age=" + age + ", address="
				+ address + ", phone=" + phone + "]";
	}

	// Builder Class
	public static class StudentBuilder {
		// required parameters
		private String id;
		private String name;
		private String classname;
		private int age;
		// optional parameters
		private String address;
		private String phone;

		public StudentBuilder(String id, String name, String classname, int age) {
			super();
			this.id = id;
			this.name = name;
			this.classname = classname;
			this.age = age;

		}

		public StudentBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public StudentBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}
}
