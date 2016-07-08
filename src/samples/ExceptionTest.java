package samples;

public class ExceptionTest
{

	public static void main(String[] args)
	{
		int x = 22;
		assert x==1 : x;
		try
		{
			
			try
			{
				System.out.println("throwing expcetion@@@");
				
				throw new RuntimeException("test");
			}
			catch(RuntimeException ex)
			{
				System.out.println("catching expcetion");
				throw ex;
			}
			finally
			{
				System.out.println(" finally");
			}
		}
		catch(RuntimeException ex)
		{
			System.out.println("catching 2");
		
		}
		finally
		{
			System.out.println(" finally 2");
		}
	}

}
