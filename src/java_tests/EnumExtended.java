package java_tests;

import java.math.BigDecimal;

public enum EnumExtended
{
	IDENTIFIER("ID"), 
	INTEGER("INT"), 
	LPAREN("("), 
	RPAREN(")"), 
	COMMA(",");
	
	private final String tokValue;

	EnumExtended(String tokValue)
	{
		this.tokValue = tokValue;
	}

	@Override
	public String toString()
	{
		return tokValue;
	}

	public static void main(String[] args)
	{
		BigDecimal test = new BigDecimal(22.222222);
		test.abs();
		System.out.println(Math.log(10));
		EnumExtended.COMMA.name();
		EnumExtended.values();
		
		System.out.println("EnumExtended values:");
		for (int i = 0; i < EnumExtended.values().length; i++)
		{
			System.out.println(EnumExtended.values()[i].name() + " = " + EnumExtended.values()[i]);			
		}
	}
}