import java.lang.reflect.Method;

// define base class and derive class
interface Animal {
	/* public */ void sound();
}

class Cat implements Animal {
	public void sound() {
		System.out.println("Miao miao~~");
	}
}

class Dog implements Animal {
	public void sound() {
		System.out.println("Wang wang~~~");
	}
}

public class TestRuntimeClass {

	public static void main(String args[]) throws Exception {
		Animal a = new Dog();
		a.sound();

		System.out.println(a.getClass());
		Method soundMethod = a.getClass().getMethod("sound");
		soundMethod.invoke(a);

		Method[] methods = a.getClass().getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}

}
