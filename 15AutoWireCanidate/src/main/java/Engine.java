
public class Engine {
	private int capacity;
	private String model;
	public Engine() {
	}
	public Engine(int capacity, String model) {
		super();
		this.capacity = capacity;
		this.model = model;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Engine other = (Engine) obj;
		if (capacity != other.capacity)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", model=" + model + "]";
	}
	
}
