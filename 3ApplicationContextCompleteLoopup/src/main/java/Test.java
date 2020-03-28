import java.util.Date;

public class Test {
	public Test() {
		System.out.println("From Application Context Constructor !");
	}
	public void getTime() {
		System.out.println("The Current Time is : "+new Date());
	}
}
