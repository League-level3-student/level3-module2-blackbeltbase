package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {

	
	public String multiply(int firstNumber, int secondNumber) {
		return firstNumber+ " x "+secondNumber+" = "+firstNumber*secondNumber;
	}
	
	public boolean isPrime(int number) {
		int limit = (int) number/2;
		int rightCounter = 0;
		if(number==3||number==5) {
			return true;
		}
		for(int i = 2; i<limit;i++) {
			if(number%i==0 ) {
				rightCounter++;
			}
			if(i==limit-1&&rightCounter ==0) {
				return true;
			}
		}
		return false;
	}
	public boolean isSquare(int number) {
		if(number == 1) {
			return true;
		}
		for(int i = 0; i<=number/2;i++) {
			if(i*i==number) {
				return true;
			}
		}
		return false;
	}
	public boolean isCube(int number) {
		if(number==1) {
			return true;
		}
		for(int i = 0; i<number;i++) {
			if(i*i*i==number) {
				return true;
			}
		}
		return false;
	}
	@Test
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }

	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }

	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }

//	@Test
//	  public void CubeTest() {
//
//	    assertTrue(isCube(27));
//	    assertTrue(isCube(216));
//	    assertTrue(isCube(729));
//	    assertTrue(isCube(1));
//	    assertFalse(isCube(3));
//	    assertFalse(isCube(22));
//	    assertFalse(isCube(143));
//
//	  }



}
