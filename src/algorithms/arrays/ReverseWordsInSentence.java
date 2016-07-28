package algorithms.arrays;

import java.util.Arrays;

import algorithms.Utils;

public class ReverseWordsInSentence
{
	public static void reverseWords(char[] s)
	{
		int i = 0;
		for (int j = 0; j < s.length; j++)
		{
			if (s[j] == ' ')
			{
				reverse(s, i, j - 1);
				i = j + 1;
			}
		}
		//reverse the last word
		reverse(s, i, s.length - 1);

		
		//reverse the whole sentence
		reverse(s, 0, s.length - 1);
	}

	public static void reverse(char[] s, int i, int j)
	{
		while (i < j)
		{
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args)
	{
		while(true)
		{
			String line = Utils.getLine("enter sentence");
			char[] sentence = line.toCharArray();
			ReverseWordsInSentence.reverseWords(sentence);
			
			System.out.println("reversed words \n : " + new String(sentence));			
		}
	}
}
