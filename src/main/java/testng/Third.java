package testng;

import org.testng.annotations.Test;

public class Third extends Four {
	@Test(dependsOnMethods= {"kr"})
	public void ind() {
		System.out.println("Enter ind");
	}

}
