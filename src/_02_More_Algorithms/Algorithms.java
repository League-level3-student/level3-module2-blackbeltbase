package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i<eggs.size();i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	public static int countPearls(List<Boolean> oysters) {
		int numPearls = 0;
		for(int i = 0; i<oysters.size();i++) {
			if(oysters.get(i)==true) {
				numPearls++;
			}
		}
		return numPearls;
	}
	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for(int i = 0; i<peeps.size()-1;i++) {
			if(peeps.get(i)>peeps.get(i+1)) {
				tallest = peeps.get(i);
			}
			else if(peeps.get(i+1)>peeps.get(i)) {
				tallest = peeps.get(i+1);
			}
		}
		return tallest;
	}
	public static String findLongestWord(List<String> words) {
		String largestWord = "";
		for(int i = 0; i<words.size();i++) {
			if(words.get(i).length()>largestWord.length()) {
				largestWord = words.get(i);
			}
		}
		return largestWord;
	}
	public static boolean containsSOS(List<String> message) {
		for(int i = 0; i<message.size();i++) {
			if(message.get(i).equalsIgnoreCase("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	public static List<Double>  sortScores(List<Double> scores){
		Double[]  array = new Double[scores.size()];
		ArrayList<Double> sortedScores = new ArrayList<Double>();
		for(int i = 0; i<array.length;i++) {
			array[i] = scores.get(i);
		}
			
		for (int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j<array.length-1;j++) {
			if (array[j] <= array[j + 1]) {
			} else {
				Double firstElement = array[j];
				array[j] = array[j + 1];
				array[j + 1] = firstElement;
			}
			}
		}
		for(int i = 0; i<array.length;i++) {
			sortedScores.add(array[i]);
		}
		return sortedScores;
	}
	public static List<String> sortDNA(List<String> dna){
		String[]  array = new String[dna.size()];
		ArrayList<String> sortedDNA = new ArrayList<String>();
		for(int i = 0; i<array.length;i++) {
			array[i] = dna.get(i);
		}
			
		for (int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j<array.length-1;j++) {
			if (array[j].length() <= array[j + 1].length()) {
			} else {
				String firstElement = array[j];
				array[j] = array[j + 1];
				array[j + 1] = firstElement;
			}
			}
		}
		for(int i = 0; i<array.length;i++) {
			sortedDNA.add(array[i]);
		}
		return sortedDNA;
	}
	public static List<String> sortWords(List<String> words){
		String[]  array = new String[words.size()];
		ArrayList<String> sortedWords = new ArrayList<String>();
		boolean isSorted = false;
		for(int i = 0; i<array.length;i++) {
			array[i] = words.get(i);
		}
			while(isSorted == false) {
		for (int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j<array.length-1;j++) {
			if (array[j].compareTo(array[j+1])>0) {
			} else {
				String firstElement = array[j];
				array[j] = array[j + 1];
				array[j + 1] = firstElement;
			}
			}
		}
		for (int i = 0; i < array.length-1; i++) {
			if(array[i].compareTo(array[i+1])<0&& i==array.length-1) {
				isSorted = true;
			}
		}
			}
		for(int i = 0; i<array.length;i++) {
			sortedWords.add(array[i]);
		}
		return sortedWords;
	}
}
