package wandrlove.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Recommendation {

    private String id;

    private String location;

    private RecommendationType type;

    private String activity;

    private List<String> categories;

    private List<String> images;

    private Double price;

    public Recommendation() {

    }

    public Recommendation(String id) {
        this.id = id;
    }

    public Recommendation(
            String location,
            String type,
            String activity,
            List<String> categories,
            List<String> images) {
        this.id = UUID.randomUUID().toString();
        this.location = location;
        this.activity = activity;
        this.categories = new ArrayList<>(categories);
        this.images = new ArrayList<>(images);
    }

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public RecommendationType getType() {
        return type;
    }

    public void setType(RecommendationType type) {
        this.type = type;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
