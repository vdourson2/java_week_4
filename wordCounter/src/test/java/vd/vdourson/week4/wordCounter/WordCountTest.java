package vd.vdourson.week4.wordCounter;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

public class WordCountTest {

	@Test
	public void countSentence1Test() {
		WordCount wordCount = new WordCount();
		Map<String,Integer> wordCountMap = wordCount.count("Hello world, hello there!");
		assertEquals((Integer) 2, wordCountMap.get("hello"));
		assertEquals((Integer) 1, wordCountMap.get("world"));
		assertEquals((Integer) 1, wordCountMap.get("there"));
	}
}
