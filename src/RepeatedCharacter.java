import java.util.ArrayList;
import java.util.HashSet;

public class RepeatedCharacter {
	public static ArrayList<Character> firstRepChar(String s) {
	    { 
	    	
	    	ArrayList<Character> list=new ArrayList<>();
	        HashSet<Character> hs=new HashSet<>();
	        for(int i=0;i<s.length();i++){
	            if(hs.contains(s.charAt(i))){
	               list.add(s.charAt(i));
	            }
	            else hs.add(s.charAt(i));
	        }
	        return list;
	    }
	}
	public static void main(String[] args) {
		ArrayList<Character> res=firstRepChar("aabcdde");
		
			System.out.println("The result is"+res);
	}
}
