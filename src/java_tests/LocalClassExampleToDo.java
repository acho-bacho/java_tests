package java_tests;



class ToDo
{
	private String name;
	private String desc;

	ToDo(String name, String desc)
	{
		this.name = name;
		this.desc = desc;
	}

	String getName()
	{
		return name;
	}

	String getDesc()
	{
		return desc;
	}

	@Override
	public String toString()
	{
		return "Name = " + getName() + ", Desc = " + getDesc();
	}
}


interface Iterator
{
	boolean hasMoreElements();

	Object nextElement();
}


class ToDoList
{
	private ToDo[] toDoList;
	private int index = 0;

	ToDoList(int size)
	{
		toDoList = new ToDo[size];
	}

	Iterator iterator()
	{
		class Iter implements Iterator
		{
			int index = 0;

			@Override
			public boolean hasMoreElements()
			{
				return index < toDoList.length;
			}

			@Override
			public Object nextElement()
			{
				return toDoList[index++];
			}
		}
		return new Iter();
	}

	void add(ToDo item)
	{
		toDoList[index++] = item;
	}
}

public class LocalClassExampleToDo
{
	public static void main(String[] args)
	{
		ToDoList toDoList = new ToDoList(5);
		toDoList.add(new ToDo("#1", "Do laundry."));
		toDoList.add(new ToDo("#2", "Buy groceries."));
		toDoList.add(new ToDo("#3", "Vacuum apartment."));
		toDoList.add(new ToDo("#4", "Write report."));
		toDoList.add(new ToDo("#5", "Wash car."));
		Iterator iter = toDoList.iterator();
		while (iter.hasMoreElements())
			System.out.println(iter.nextElement());
	}
}
