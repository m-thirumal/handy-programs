/**
 * 
 */

/**
 * @author thirumal
 *
 */
public class StaticMethod {

	/**
	 * 
	 */
	public StaticMethod() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a = new A();
		a.a();
	}
	

}

class A {
	public void a() {
		System.out.println("hello");
	}
}
