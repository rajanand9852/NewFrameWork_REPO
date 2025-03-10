package Practice2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OrgTest {
	@Test
	public void createOrgTest() {
		
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String PASSWORD = System.getProperty("password");
		String USERNAME = System.getProperty("username");
		
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(PASSWORD);
		System.out.println(USERNAME);
		System.out.println("execute createOrgTest");
	}
	
	
	@Test
	public void modifyOrgTest() {
		System.out.println("execute modifyOrgTest");
	}

}
