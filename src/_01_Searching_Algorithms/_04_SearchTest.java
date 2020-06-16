package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		_00_LinearSearch dia = new _00_LinearSearch();
		String[] firstOne = {"lick", "stick", "trick", "mimick","reet"};
		String[] secondOne = {"sat", "pat","cat","rat"};
		String[] thirdOne = {"moot", "foot", "coot", "soot"};
		assertEquals(1, dia.linearSearch(firstOne,"stick"));
		assertEquals(3,  dia.linearSearch(secondOne,"rat"));
		assertEquals(2,  dia.linearSearch(thirdOne,"coot"));
		
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		_01_BinarySearch dia = new _01_BinarySearch();
		int[] sorted1 = {6, 36, 789, 800,801 , 802};
		int[] sorted = {0, 1, 2, 2, 3, 4};
		int[] thirdOne = {4,4,5,43,123};
		assertEquals(1, dia.binarySearch(sorted1, 0, 5, 36));
		assertEquals(-1, dia.binarySearch(sorted, 0, 5, 19));
		assertEquals(0, dia.binarySearch(thirdOne, 0, 4, 4));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		_02_InterpolationSearch dia = new _02_InterpolationSearch();
		int[] sorted1 = {2,4,6,8,10,12,14};
		int[] sorted = {10,20,30,40,50,60,70,80};
		int[] thirdOne = {0,1,2,3,4,5,6};
		assertEquals(3, dia.interpolationSearch(sorted1,8));
		assertEquals(6, dia.interpolationSearch(sorted,70));
		assertEquals(-1, dia.interpolationSearch(thirdOne,8));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		_03_ExponentialSearch dia = new _03_ExponentialSearch();
		int[] sorted1 = {2,4,6,8,10,12,14};
		int[] sorted = {10,20,30,40,50,60,70,80};
		int[] thirdOne = {0,1,2,3,4,5,6};
		assertEquals(-1, dia.exponentialSearch(sorted1,19));
		assertEquals(0, dia.exponentialSearch(sorted,10));
		assertEquals(1, dia.exponentialSearch(thirdOne,1));;
	}
}
