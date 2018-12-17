package com.khtm.test.kjhh.provider.test;

import com.khtm.test.kjhh.common.User;
import com.khtm.test.kjhh.common.UserService;

public class ClienServiceImpl implements ClientService {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(String firstName, String lastName) {
        System.out.println("addUserFunction called.");
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        userService.addUser(user);
        System.out.println("User Inserted to DB.");
    }
}
