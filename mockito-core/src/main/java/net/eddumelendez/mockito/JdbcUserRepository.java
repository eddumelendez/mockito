package net.eddumelendez.mockito;

public class JdbcUserRepository implements UserRepository {

	public String getPassword(String username) {
		return "Password";
	}

}
