package builder;

public class BuilderMain {

	public static void main(String[] args) {

		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();

		System.out.println("comp: " + comp);
		Student student = new Student.StudentBuilder("1", "TH", "cntt", 21).setAddress("Vo Thi Sau")
				.setPhone("0123456789").build();
		System.out.println("student: " + student);
	}
}
