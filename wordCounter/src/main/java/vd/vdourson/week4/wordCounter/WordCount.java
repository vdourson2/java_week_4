package vd.vdourson.week4.wordCounter;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class WordCount {
	
	/* This methods counts the occurrences of each word in a sentence.
	 * It takes a sentence as input and returns the occurrences of each word in a hashmap.
	 * The count is case insensitive and disregards punctuation */
	public Map<String, Integer> count(String sentence) {
		String[] words = sentence.split(" ");
		Map<String, Integer> countOfWords = new HashMap(); 
		for(String word:words) {
			String cleanWord = word.replaceAll("\\p{Punct}", "").toLowerCase();
			countOfWords.merge(cleanWord, 1, Integer::sum);
		}
		return countOfWords;
	}
	
}
