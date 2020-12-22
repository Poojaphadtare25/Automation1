package testng;

import org.testng.annotations.Test;

public class First extends Second {
	@Test(dependsOnMethods= {"ap"})
	public void ak()
	{
		System.out.println("Enter ak");
	}

}
