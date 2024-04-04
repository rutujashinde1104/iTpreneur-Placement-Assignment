package iTpreneurPlacementAssignment;
import java.util.HashMap;
public class DuplicateCharacters {



	    public static void findDuplicateCharacters(String str) {

	        HashMap<Character, Integer> charFreq = new HashMap<>();
	        
	     
	        str = str.toLowerCase();
	        
	    
	        for (char ch : str.toCharArray()) {
	     
	            if (ch != ' ') {
	               
	                charFreq.put(ch, charFreq.getOrDefault(ch, 0) + 1);
	            }
	        }
	        
	      
	        System.out.print("Duplicate characters in the string: ");
	        for (char ch : charFreq.keySet()) {
	            if (charFreq.get(ch) > 1) {
	                System.out.print(ch + " ");
	            }
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        String inputString = "Hello World";
	        

	        findDuplicateCharacters(inputString);
	    
	    }
	

}
