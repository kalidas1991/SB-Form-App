package in.com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.com.app.model.User;
import in.com.app.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public String saveUser(User user) {
		User userObj = userRepo.save(user);
		Integer userId = userObj.getUserId();
		if (userId > 0) {
			return "User saved successfully";
		} else {
			return "Failed to  save user";
		}

	}

}
