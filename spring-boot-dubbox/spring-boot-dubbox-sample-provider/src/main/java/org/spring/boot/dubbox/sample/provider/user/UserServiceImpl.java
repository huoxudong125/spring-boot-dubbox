package org.spring.boot.dubbox.sample.provider.user;

import com.alibaba.dubbo.config.annotation.Service;
import org.spring.boot.dubbox.sample.api.user.User;
import org.spring.boot.dubbox.sample.api.user.UserService;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl() {
        users=new ArrayList<User>();

        User user = new User();
        user.setAge(20);
        user.setId(1);
        user.setName("chenlei");
        this.users.add(user);

        user = new User();
        user.setAge(20);
        user.setId(2);
        user.setName("huoxudong125");
        this.users.add(user);
    }

    @Override
    public User getUser(int userId) {
        User user = users.stream()
                .filter(u -> u.getId() == userId)
                .findFirst()
                .orElse(null);
        return user;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }


}
