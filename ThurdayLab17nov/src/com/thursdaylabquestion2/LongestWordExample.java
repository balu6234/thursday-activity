package com.thursdaylabquestion2;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class LongestWordExample {

	public static void main(String[] args)throws FileNotFoundException {
    new LongestWordExample().findLongestWords();
	}

	public String findLongestWords() throws FileNotFoundException
	{
		String longest_word="";
		String Word;
		Scanner sc=new Scanner(new File("E:testfile.txt"));
		while (sc.hasNext())
		{
			Word=sc.next();
			if(Word.length()>longest_word.length())
			{
				longest_word=Word;
			}
			
		}
		System.out.println("\n"+longest_word+"\n");
		 return longest_word;
	}

}
