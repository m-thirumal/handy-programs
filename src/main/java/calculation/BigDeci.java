/**
 * 
 */
package calculation;

import java.math.BigDecimal;

/**
 * @author thirumal
 *
 */
public class BigDeci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Boolean n = null;
		System.out.println(String.valueOf(n));
		BigDecimal a = new BigDecimal(122);
		BigDecimal b = new BigDecimal(123);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("Diff: " + b.subtract(a));
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
	}

}
