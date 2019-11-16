public class TestRuntime {
	public static void main(String args[]) {
		Runtime.getRuntime().addShutdownHook(new ShutdownHook());
		Runtime.getRuntime().addShutdownHook(new ShutdownHook2());
	}

	static class ShutdownHook extends Thread {
		@Override
		public void run() {
			System.out.println("The application will be shutdown...");
		}
	}

	static class ShutdownHook2 extends Thread {
		@Override
		public void run() {
			System.out.println("ShutdownHook2: The application will be shutdown...");
		}
	}
}
