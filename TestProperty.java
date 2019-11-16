import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Enumeration;

public class TestProperty {
	public static void main(String[] args) throws Exception {
		System.out.println("This program is");
		System.setProperty("user.dir", "D:/tomcat");
		System.out.println(System.getProperty("user.dir"));

		File f = new File("E:/Study/java_console/test.properties");
		if (f.exists()) {
			System.out.println("The file is exist.");
			FileInputStream fis = new FileInputStream(f);
			
			Properties p = new Properties();
			p.load(fis);

			Enumeration<?> enumeration = p.propertyNames();
			while (enumeration.hasMoreElements()) {
				String name = (String) enumeration.nextElement();
				System.out.print(name + "=");
				System.out.println(p.getProperty(name));
			}
			System.out.println(p.getProperty("a"));
		}
	}
}
