package ejemplo.utils;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {


    public String GetProperty(String propertyName) throws IOException {
    	Properties prop = new Properties();
		InputStream input = null;		
		input = new FileInputStream("parametros.properties");
		prop.load(input);
        return prop.getProperty(propertyName).replace("\"","").replace(";", "");
    }

}
