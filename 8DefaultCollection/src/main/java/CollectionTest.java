import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTest {
	private List<String> cityName;
	private Set<String> sea;
	private Map<String,String> countryCapital;
	public CollectionTest() {
	}
	public CollectionTest(List<String> cityName, Set<String> sea, Map<String, String> countryCapital) {
		super();
		this.cityName = cityName;
		this.sea = sea;
		this.countryCapital = countryCapital;
	}
	public List<String> getCityName() {
		return cityName;
	}
	public void setCityName(List<String> cityName) {
		this.cityName = cityName;
	}
	public Set<String> getSea() {
		return sea;
	}
	public void setSea(Set<String> sea) {
		this.sea = sea;
	}
	public Map<String, String> getCountryCapital() {
		return countryCapital;
	}
	public void setCountryCapital(Map<String, String> countryCapital) {
		this.countryCapital = countryCapital;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
		result = prime * result + ((countryCapital == null) ? 0 : countryCapital.hashCode());
		result = prime * result + ((sea == null) ? 0 : sea.hashCode());
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
		CollectionTest other = (CollectionTest) obj;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equals(other.cityName))
			return false;
		if (countryCapital == null) {
			if (other.countryCapital != null)
				return false;
		} else if (!countryCapital.equals(other.countryCapital))
			return false;
		if (sea == null) {
			if (other.sea != null)
				return false;
		} else if (!sea.equals(other.sea))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CollectionTest [cityName=" + cityName + ", sea=" + sea + ", countryCapital=" + countryCapital + "]";
	}
	
}
