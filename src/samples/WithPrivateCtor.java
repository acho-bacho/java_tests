package samples;

public class WithPrivateCtor
{
	int member = 0;

	private WithPrivateCtor()
	{
	}

	public WithPrivateCtor(int mem)
	{
		this.member = mem;
	}

	public static void main(String[] args)
	{
		WithPrivateCtor tst = new WithPrivateCtor();

	}

}

class Child
{
	WithPrivateCtor embedded = new WithPrivateCtor(1);

	Child()
	{
		embedded.member = 22;
	}
}