package com.vesanieminen.projecteuler9;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPythagoreanTriplet {

	@Test
	public void findTriplet() {
		PythagoreanTriplet pythagoreanTriplet = new PythagoreanTriplet();
		assertArrayEquals(pythagoreanTriplet.findTripletsForSum(12), new double[]{3, 4, 5}, 0);
	}

}