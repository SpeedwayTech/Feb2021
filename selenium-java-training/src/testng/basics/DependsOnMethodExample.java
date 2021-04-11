package testng.basics;

import org.testng.annotations.Test;

public class DependsOnMethodExample {
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest(){
		System.out.println("Home Page test");
	}
	
//	@Test(dependsOnMethods="homePageTest")
//	public void searchPageTest(){
//		System.out.println("SearchPageTest");
//		
//	}
//	
//	@Test(dependsOnMethods="loginTest")
//	public void regPageTest(){
//		System.out.println("RegPageTest");
//	}
	
	@Test
	public void loginTest(){
		System.out.println("login test");
	}
	
	

}
