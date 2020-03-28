import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DriverTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c=Class.forName("Test");
		Constructor cons[]=c.getDeclaredConstructors();
		cons[0].setAccessible(true);
		System.out.println("**********");
		Test t1=(Test)cons[0].newInstance(null);
		
	}
}
