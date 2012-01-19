package com.vesanieminen.projecteuler9;

/**
 * 
 * @author veracious
 * 
 * Project Euler exercise #9 description:

	A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
	
	a^2 + b^2 = c^2
	For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
	
	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	Find the product abc.
 */
public class PythagoreanTriplet {

	public double[] findTripletsForSum(double sum) {
		double a, b;
		a = b = 1;
		for (int i = 2; i < sum; ++i) {
			a = i;
			for (int j = 2; j < sum; j++) {
				b = j;
				if (solved(a, b, sum)) {
					System.out.println(a + " " + b + " " + getC(a, b));
					return new double[] {a, b, getC(a, b)};
				}
			}
		}
		return null;
	}
	
	private boolean solved(double a, double b, double sum) {
		return sum == a + b + getC(a, b);
	}

	private double getC(double a, double b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
	

}
