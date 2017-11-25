package wandrlove.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wandrlove.model.Recommendation;
import wandrlove.service.RecommendationService;

import javax.ws.rs.GET;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/recommendations")
public class RecommendationController {

    private RecommendationService recommendationService;

    @Autowired
    public RecommendationController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @GetMapping
    public List<Recommendation> getRecommendations(
            @RequestParam(value = "userId", defaultValue = "facebookUser") String userId) {

        return recommendationService.getRecommendationsForUser(userId);
    }
}
