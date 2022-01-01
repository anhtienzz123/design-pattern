package command.document;

public class Client {

	public static void main(String[] args) {
		DocumentInvoker instance = new DocumentInvoker();
		instance.write("The 1st text. ");
		instance.undo();
		System.out.println("====Read");
		instance.read(); // EMPTY

		instance.redo();
		System.out.println("====Read");
		instance.read(); // The 1st text.

		instance.write("The 2nd text. ");
		instance.write("The 3rd text. ");
		System.out.println("====Read");
		instance.read(); // The 1st text. The 2nd text. The 3rd text.
		instance.undo(); // The 1st text. The 2nd text.
		instance.undo(); // The 1st text.
		instance.undo(); // EMPTY
		instance.undo(); // Nothing to undo
	}
}
