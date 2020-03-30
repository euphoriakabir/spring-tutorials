import java.util.Properties;

public class PropertiesReader {
	private Properties prop;
	public PropertiesReader() {
	}
	public PropertiesReader(Properties prop) {
		super();
		this.prop = prop;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
}
