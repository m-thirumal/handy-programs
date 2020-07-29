/**
 * 
 */
package com.thirumal.math;

/**
 * @author thirumal
 *
 */
public class TowerHanoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		solve(2, 'A', 'B', 'C');
	}

	public static void solve(int disks, char sourcePeg, char destPeg, char tempPeg) {
		if (disks == 1) {
			System.out.println("Move disk 1 from SourcePeg: " + sourcePeg + " destPeg: " + destPeg);
			return;
		}
		solve(disks - 1, sourcePeg, tempPeg, destPeg);
		System.out.println("Move disk " + disks + " from peg " + sourcePeg + " to " + destPeg);
		solve(disks - 1, tempPeg, destPeg, sourcePeg);
	}
	
}
