import java.io.*;

public class TestFile {
	public static void main(String[] args) throws Exception {
		File file = new File("E:/tomcat", "webapp");
		System.out.println(file.getCanonicalPath());
	}
}
