
public class DriverClass {

	public static void main(String[] args) {
		try {
			MyInterface i=(B)Class.forName("B").newInstance();
			i.sayHi();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
