package wandrlove.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wandrlove.model.User;
import wandrlove.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/createUserWithInterests")
    public String createUserWithInterests(List<String> interests) {
        User user = userService.generateUser();
        String userId = user.getUserId();
        userService.putInterestsForUser(userId, interests);
        return userId;
    }
}
