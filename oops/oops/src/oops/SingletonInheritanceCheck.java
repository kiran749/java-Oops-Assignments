package oops;

public class SingletonInheritanceCheck {

private static SingletonInheritanceCheck single_instance = null;
	
	public static SingletonInheritanceCheck getInstance() {
		if (single_instance == null) {
			single_instance = new SingletonInheritanceCheck ();
		}
		
		return single_instance;
	}
}