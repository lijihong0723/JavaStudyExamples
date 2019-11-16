import java.util.concurrent.*;

public class TestRunnable {
	public static void main(String[] args) {
		Runnable hellos = () -> {
			for (int i = 0; i <= 1000; i++)
				System.out.println("Hello " + i);
		};
		Runnable goodbyes = () -> {
			for (int i = 0; i <= 1000; i++)
				System.out.println("Goodbye " + i);
		};

		Executor executor = Executors.newCachedThreadPool();
		executor.execute(hellos);
		executor.execute(goodbyes);
	}
}
