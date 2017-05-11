package org.spring.boot.dubbox.sample.consumer;

import org.spring.boot.dubbox.sample.api.user.User;
import org.spring.boot.dubbox.sample.consumer.service.UserServiceRPC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Hello world!
 *
 */
@RestController
@SpringBootApplication()
public class App {
	@Autowired
	private UserServiceRPC userServiceRPC;

	@RequestMapping("/users/{userId}")
	User home(@PathVariable int userId) {
		return userServiceRPC.getUserService().getUser(userId);
	}

	@RequestMapping("/users")
	List<User> getUsers(){
		return userServiceRPC.getUserService().getUsers();
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
