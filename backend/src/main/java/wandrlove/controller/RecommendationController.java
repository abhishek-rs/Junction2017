package wandrlove.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wandrlove.model.Recommendation;

@RestController
@RequestMapping("/recommendations")
public class RecommendationController {

    public Recommendation[] getRecommendations(
            @RequestParam(value = "userId") String userId) {

        return null;
    }
}
