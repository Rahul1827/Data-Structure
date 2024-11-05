package PracticeQuestion20October;


	
	import java.util.Queue;
	import java.util.ArrayDeque;

	public class ConvertBinaryToDecimal {
	    public static int binaryToDecimal(String binaryStr) {
	        Queue<Integer> queue = new ArrayDeque<>();
	        
	       
	        for (char digit : binaryStr.toCharArray()) {
	            queue.add(Character.getNumericValue(digit));
	        }
	        
	        int decimalValue = 0;
	        int length = queue.size();
	        
	       
	        for (int i = 0; i < length; i++) {
	            int bit = queue.poll();
	            decimalValue += bit * Math.pow(2, length - i - 1);
	        }
	        
	        return decimalValue;
	    }

	    public static void main(String[] args) {
	        String binaryStr = "1101";  
	        int decimalValue = binaryToDecimal(binaryStr);
	        System.out.println("Binary " + binaryStr + " is decimal " + decimalValue);
	    }
	}

	


