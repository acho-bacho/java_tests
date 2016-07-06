package java_tests;

public class ArrayTest
{
	static int[][] m_Array = new int[5][10];
	
	public static void main(String[] args)
	{
		for (int rows = 0; rows < m_Array.length; rows++)
		{
			for (int cols = 0; cols < m_Array[rows].length; cols++)
			{
				System.out.print(m_Array[rows][cols]);
			}
			System.out.println("");
		}
	}

}
