package prob4;
import java.util.List;

public class Prob4 {
	public int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream().filter(word -> word.length() == len).filter(word -> word.indexOf(c) >= 0).filter(word -> word.indexOf(d) == -1).count();
	}
	
	public static void main(String[] args) {
		Prob4 counter = new Prob4();
        	List<String> words = List.of("apple", "banana", "cherry", "date", "apricot", "grape");
        	int result = counter.countWords(words, 'a', 'c', 5);
        	System.out.println(result);
	}

}

