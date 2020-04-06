
public class MySingleton {
	private static MySingleton ms;
	private MySingleton() {
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	public static MySingleton getMySingleton() {
		if(ms!=null) {
			return ms;
		}
		else {
			ms= new MySingleton();
			return ms;
		}
	}
}
