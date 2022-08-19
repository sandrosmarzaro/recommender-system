package org.recommender;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.io.IOException;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException, TasteException {

//        DataModel model = new Recommended().getBooksModel();
        DataModel model = new Recommended().getMoviesModel();
        Recommender recommender = new RecommendedBuilder().buildRecommender(model);
        List<RecommendedItem> recommendations = recommender.recommend(1, 10);

        recommendations.forEach(System.out::println);
    }
}
