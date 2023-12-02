package lab7;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
	
	private final Map<String, Integer> wordMap = new HashMap<>();
	
	public void addWord(String word) {
		wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
	}
	
	public void addSentence(String sentence) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            addWord(word.toLowerCase());
        }
    }
	
	public void outputResults() {
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
