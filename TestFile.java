import java.io.*;

class Hello
{
	
}

public class TestFile {
	public static void main(String[] args) throws Exception {
		File file = new File("E:/tomcat", "webapp");
		System.out.println(file.getCanonicalPath());
		System.out.println(file.isAbsolute());

		File f = new File("./tomcat", "webapp");
		System.out.println(f.isAbsolute());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getAbsolutePath());

		System.out.println(f.exists());

		File serverConfig = new File("server.xml");
		if (!serverConfig.exists()) {
			System.out.println("configuration file is not exist!");
			return;
		}

		Hello h = new Hello();
		System.out.println(h.getClass().getClassLoader());

		/*InputStream in = h.getClass().getClassLoader().getResourceAsStream(serverConfig.getCanonicalPath());
		if (in == null)
		{
			return;
		}*/

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(serverConfig));
		byte buffer[] = new byte[1024];
		int bytesRead = 0;
		while ((bytesRead = bis.read(buffer)) != -1) {
			String s = new String(buffer, 0, bytesRead);
			System.out.println(s);
		}
		// System.out.println(in.readAllBytes());
	}
}
