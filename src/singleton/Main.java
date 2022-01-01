package singleton;

public class Main {

	public static void main(String[] args) {
		
		ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
		
		System.out.println("threadSafeSingleton: " + threadSafeSingleton.hashCode());
		System.out.println("threadSafeSingleton1: " + threadSafeSingleton1.hashCode());
	}
}
