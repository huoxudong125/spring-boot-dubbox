package org.spring.boot.dubbox.sample.api.user;

import java.util.List;

public interface UserService {
	
	User getUser(int userId);

	List<User> getUsers();
}
