package net.eddumelendez.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {
	
	@Mock								//1. Create UserRepository mock object
	UserRepository userRepository; 

	@InjectMocks						//2. Insert UserRepository mock object into UserService
	UserService userService = new UserServiceImpl();

	@Before
	public void setup() {
		//MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSomething() {
		String username = "emelendez";
		Mockito.when(userRepository.getPassword(username)).thenReturn("PasswordMock"); //3. Mocking objects
		userService.validateCredential(username);
		Mockito.verify(userRepository).getPassword(username);
	}

}
