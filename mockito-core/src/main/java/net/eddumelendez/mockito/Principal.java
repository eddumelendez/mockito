package net.eddumelendez.mockito;

public class Principal {
	
	private Dependency dependencyClass;
	
	public void setDependencyClass(Dependency dependencyClass) {
		this.dependencyClass = dependencyClass;
	}
	
	public void principalMethod() {
		String message = dependencyClass.doSomething();
		System.out.println(message);
	}
	
}
