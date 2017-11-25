package wandrlove.service;

import org.springframework.stereotype.Service;
import wandrlove.model.User;

import java.util.Map;
import java.util.UUID;

@Service
public class UserService {

    private Map<String, User> users;

    public String generateUser() {
        String userId = UUID.randomUUID().toString();

        User newUser = new User(userId);
        users.put(userId, newUser);

        return userId;
    }

    public void putInterestsForUser(String userId, String[] userInterests) {
        User user = users.get(userId);
        user.setInterests(userInterests);
    }
}
