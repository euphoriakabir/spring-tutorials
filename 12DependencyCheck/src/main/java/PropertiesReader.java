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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prop == null) ? 0 : prop.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PropertiesReader other = (PropertiesReader) obj;
		if (prop == null) {
			if (other.prop != null)
				return false;
		} else if (!prop.equals(other.prop))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PropertiesReader [prop=" + prop + "]";
	}
	
}
