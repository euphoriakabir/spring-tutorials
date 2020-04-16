import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MyMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("From MyMethodReplacer for M3");
		return obj;
	}

}
