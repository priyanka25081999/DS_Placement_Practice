// String : Print the maximum occurring character in a string
// If multiple characters have same occurrence then print all characters
// Approach : Use of HashMap and HashSet

import java.util.*;
public class Main
{
    static public void print_max_char(String s)
    {
        HashMap<Character, Integer> hmap = new HashMap<>();
        HashSet<Character> hset = new HashSet<>();
        int max = -1;

        for(int i=0; i<s.length(); i++)
        {
            hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i=0; i<s.length(); i++)
        {
            int freq = hmap.get(s.charAt(i));
            
            if(max<freq)
               max=freq;
        }
        
        for(int i=0; i<s.length(); i++)
        {
            if(max == hmap.get(s.charAt(i)))
            {   
                hset.add(s.charAt(i));
            }
        }
        System.out.println("HashSet : "+ hset);
    }
	public static void main(String[] args) {
		print_max_char("aabbca");  // HashSet : [a]
		print_max_char("aabbbca"); // HashSet : [a, b]
	}
}
