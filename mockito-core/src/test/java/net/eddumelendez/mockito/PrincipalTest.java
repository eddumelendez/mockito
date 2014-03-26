package net.eddumelendez.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PrincipalTest {
	
	@Mock								//1. Create DependencyClass mock object
	Dependency dependency; 

	@InjectMocks						//2. Insert DependencyClass mock object into PrincipalClass
	Principal principal = new Principal();

	@Before
	public void setup() {
		//MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSomething() {
		Mockito.when(dependency.doSomething()).thenReturn("This is a mock"); //3. Mocking objects
		principal.principalMethod();
		Mockito.verify(dependency).doSomething();
	}

}
