package Generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_Utility {
	
	public String ReadPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/testing.properties");
		Properties ps=new Properties();
		ps.load(fis);
		
	   String value = ps.getProperty(key);
	
	   return value;
		
		
	}

}
