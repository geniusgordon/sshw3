package model;

/**
 * This is the file doing pre-process for your input. You are ask to:
 * 1.Implement file input and load it into your data structure. 
 * 	ArrayList is recommend as the data structure for SentencePC and SentenceMP 
 * 2.A method that randomly choose a sentence in your data structure as the 
 * 	question 
 * 
 * */

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Model {
	
	/*
	 * Hints for parsing input:
	 * 
	 * Using "split" method in String class to distribute inputed line.
	 * Use regular expression as a split method    
	 * String str = new String(); 
	 * str.split("[^-0-9]"); 	  // Get only the digits in the string.
	 * str.split("[^A-Za-z ]");   // Get numbers letter with a space in the string. 
	 * str.split("[A-Za-z0-9-]"); // Get anything in the string but keep letter, digit and '-' away
	 */
	private static List<ArrayList<SentenceElement>> list  = new ArrayList <ArrayList <SentenceElement>>();
	
	static {
		readInput();
	}
	
	public static void readInput() {
		try {
			String path = "C:\\Users\\子皓\\Desktop\\SoftwareStudioAssignment3_2\\SoftwareStudioAssignment3_2\\src\\res\\PCTestData.txt";
			 BufferedReader in = new BufferedReader(
				       new InputStreamReader(
				                  new FileInputStream(new File(path)), "UTF8"));

			String line = null;
			list.add(new ArrayList <SentenceElement>());
			List <SentenceElement> ref = list.get(list.size()-1);
			while ((line = in.readLine()) != null) {
				String[] a = line.split(" ");
				int num = Integer.parseInt(a[0]);
				if (num == -1) {
					list.add(new ArrayList <SentenceElement>());
					ref = list.get(list.size()-1);
					continue;
				}
				String eng = a[1];
				for (int i = 2; i < a.length-1; i++)
					eng += " " + a[i];
				String chin = a[a.length-1];
				ref.add(new SentenceElement(num, eng, chin));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<SentenceElement> getQuestion() {
		Random r = new Random();
		int i = r.nextInt(list.size());
		return list.get(i);
	}
	
	/**
	 * private static String stringArrayToString(String[] str) For the return
	 * value of split is String[], turn String[] to String for better use
	 * 
	 * @input - String[] str - a String[]
	 * @return - String
	 */
	private static String stringArrayToString(String[] str) {
		String temp = null;
		for(String i: str) temp = i;
		return temp;
	}
		
}

