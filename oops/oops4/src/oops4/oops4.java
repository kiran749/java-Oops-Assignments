package oops4;

public class oops4 {

}
abstract class A{
	int abstract_var;
}

abstract class B extends A{
	public abstract void fun();
}

class AbstractClass extends B {
	@Override
 public void fun() {
System.out.println("This is an example of an Abstract Class");
	}
}