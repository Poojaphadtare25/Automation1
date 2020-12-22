package testng;

import org.testng.annotations.Test;

public class SameAnnotatn {
	@Test(enabled=false) //to skip testcase execution.
public void apple()
{
	System.out.println("apple");
}
	@Test(alwaysRun=true) //To run the testcase execution always.
public void banana()
{
	System.out.println("banana");
}
	@Test
public void kiwi()
{
	System.out.println("kiwi");
}
}
