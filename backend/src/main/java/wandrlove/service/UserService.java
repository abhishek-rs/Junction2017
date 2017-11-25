package wandrlove.service;

import org.springframework.stereotype.Service;
import wandrlove.model.User;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class UserService {

    private Map<String, User> users;

    public User generateUser() {
        String userId = UUID.randomUUID().toString();

        User newUser = new User(userId);
        users.put(userId, newUser);

        return newUser;
    }

    public void putInterestsForUser(String userId, List<String> userInterests) {
        User user = users.get(userId);

        if (user == null) {
            user = generateUser();
        }
        user.setInterests(userInterests);
    }


}
