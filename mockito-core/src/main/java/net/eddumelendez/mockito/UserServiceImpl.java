package net.eddumelendez.mockito;

public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void validateCredential(String username) {
		String message = userRepository.getPassword(username);
		System.out.println(message);
	}
	
}
