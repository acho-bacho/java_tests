package algorithms.string;

import java.util.HashMap;

import algorithms.Utils;

/**Given two strings s and t, determine if they are isomorphic. 
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.*/
public class IsomorphicStrings
{

	public static void main(String[] args)
	{
		while(true)
		{
			String line = Utils.getLine("enter 2 strings");
			//String[] tokens = new String[] { "2", "1", "+", "3", "*" };
			String[] tokens = line.split(" ");
			System.out.println("isomorphic  :\n" + isIsomorphic(tokens[0], tokens[1]));			
		}
	}

	public static boolean isIsomorphic(String s, String t)
	{
		if (s == null || t == null)
			return false;

		if (s.length() != t.length())
			return false;

		HashMap<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < s.length(); i++)
		{
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);

			if (map.containsKey(c1))
			{
				if (map.get(c1) != c2)// if not consistant with previous ones
					return false;
			}
			else
			{
				if (map.containsValue(c2)) // if c2 is already being mapped
				{
					return false;					
				}
				map.put(c1, c2);
			}
		}

		return true;
	}
}
