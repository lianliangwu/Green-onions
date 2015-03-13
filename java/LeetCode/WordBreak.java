// Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.
// For example, given
// s = "leetcode",
// dict = ["leet", "code"].
// Return true because "leetcode" can be segmented as "leet code".

import java.io.*;
import java.util.*;

public class WordBreak{

	public static void main(String[] args){

		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
		Set<String> dict = new HashSet<String>();
		dict.add("a");
		dict.add("aa");
		dict.add("aaa");
		dict.add("aaaa");
		dict.add("aaaaa");
		if(wordBreak(s, dict)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}		
	}
	
	public static boolean wordBreak(String s, Set<String> dict) {
		int len = s.length();
		//null string
		if(len==0) {return false;}
		//single char string
		if(len==1) {return match(s, dict);}
		//multi char string
		String part1,part2;
		for(int i=0; i<len; i++){
			//all char string
			if(i==len-1 && match(s, dict)) {return true;}
			part1=s.substring(0,i+1);
			part2=s.substring(i+1,len);
			if( match(part1, dict) && wordBreak(part2, dict)) {
				return true;
			} 
		}
		return false;		
	}

	public static boolean match(String s, Set<String> dict) {
		for (String e: dict){
			if(e.equals(s)){
				return true;
			}
		}
		return false;
	}	

}
