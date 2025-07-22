class SingletonDemo
{
	private static SingletonDemo singleInstance;

	private SingletonDemo()
	{
		System.out.println("Constructor is created.");
	}

	public static SingletonDemo getInstance()
	{
		if(singleInstance == null)
		{
			singleInstance = new SingletonDemo();
		}
		return singleInstance;
	}

	public void showMessage()
	{
		System.out.println("Hello World");
	}
}