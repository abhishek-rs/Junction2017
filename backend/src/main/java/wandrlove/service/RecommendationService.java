package wandrlove.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Service;
import wandrlove.model.Recommendation;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class RecommendationService {

    private List<Recommendation> facebookUserRecommendations;

    private List<Recommendation> genericRecommendations;

    private UserService userService;

    @Autowired
    private PathMatchingResourcePatternResolver resolver;

    @Autowired
    public RecommendationService(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    private void initialize() {
        Resource resource = new ClassPathResource("classpath*:**/data.json");
        File file = null;
        try {
            file = resource.getFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode rootNode = objectMapper.readTree(file);
            JsonNode recommendationsNode = rootNode.get("recommendations");
            String recommendationsContent = recommendationsNode.toString();
            facebookUserRecommendations = objectMapper.readValue(
                    recommendationsContent,
                    new TypeReference<List<Recommendation>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(facebookUserRecommendations);
    }

    public List<Recommendation> getRecommendationsForUser(String userId) {

        boolean isFacebookUser = StringUtils.equalsIgnoreCase(userId, "facebookUser");
        if (isFacebookUser) {
            return facebookUserRecommendations;
        } else {
            //dynamically generate.
        }

        return null;
    }

}
