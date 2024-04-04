package iTpreneurPlacementAssignment;
import java.util.HashMap;
public class WordCount {
	
	    public static int countWords(String str) {
	    
	        HashMap<String, Integer> wordFreq = new HashMap<>();
	        
	      
	        String[] words = str.split("\\s+");

	        
	        for (String word : words) {
	          
	            word = word.trim().toLowerCase();
	            
	       
	            if (!word.isEmpty()) {
	     
	                wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
	            }
	        }
	        
	
	        return wordFreq.size();
	    }

	    public static void main(String[] args) {
	
	        String inputString = "HELLO WORLD";
	        
	       
	        int wordCount = countWords(inputString);
	        
	        System.out.println("Number of words in the string: " + wordCount);
	       
	    }
	}



	   