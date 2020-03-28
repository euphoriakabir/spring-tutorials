import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class DataClass {
	private LinkedList<String> candidateName;
	private LinkedHashSet<String> gender;
	private LinkedHashMap<String,Integer> marksRule;
	public DataClass() {
	}
	public DataClass(LinkedList<String> candidateName, LinkedHashSet<String> gender,
			LinkedHashMap<String, Integer> marksRule) {
		super();
		this.candidateName = candidateName;
		this.gender = gender;
		this.marksRule = marksRule;
	}
	public LinkedList<String> getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(LinkedList<String> candidateName) {
		this.candidateName = candidateName;
	}
	public LinkedHashSet<String> getGender() {
		return gender;
	}
	public void setGender(LinkedHashSet<String> gender) {
		this.gender = gender;
	}
	public LinkedHashMap<String, Integer> getMarksRule() {
		return marksRule;
	}
	public void setMarksRule(LinkedHashMap<String, Integer> marksRule) {
		this.marksRule = marksRule;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((candidateName == null) ? 0 : candidateName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((marksRule == null) ? 0 : marksRule.hashCode());
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
		DataClass other = (DataClass) obj;
		if (candidateName == null) {
			if (other.candidateName != null)
				return false;
		} else if (!candidateName.equals(other.candidateName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (marksRule == null) {
			if (other.marksRule != null)
				return false;
		} else if (!marksRule.equals(other.marksRule))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DataClass [candidateName=" + candidateName + ", gender=" + gender + ", marksRule=" + marksRule + "]";
	}
	
}
