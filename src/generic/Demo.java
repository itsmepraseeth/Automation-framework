package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties p= new Properties();
		p.load(new FileInputStream("./qsp.properties"));
		String v = p.getProperty("gg");
		System.out.println(v);
	}

}
