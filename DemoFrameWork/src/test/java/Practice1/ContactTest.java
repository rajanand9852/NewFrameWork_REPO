package Practice1;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
	public void createcontactTest() {
		
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String PASSWORD = System.getProperty("password");
		String USERNAME = System.getProperty("username");
		
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(PASSWORD);
		System.out.println(USERNAME);
		
		
		
		
	}
	@Test
	public void modifycontactTest() {
		
		System.out.println("execute modifycontact");
	}
	@Test
	public void deletecontactTest() {
		System.out.println("execute delectcontact ");
	}

}
