package org.recommender;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;

import java.io.IOException;

public class Evaluator {

    public static void main(String[] args) throws IOException, TasteException {

        RandomUtils.useTestSeed();
        DataModel dataModel = new Recommended().getMoviesModel();
        RecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
        RecommendedBuilder builder = new RecommendedBuilder();
        double score = evaluator.evaluate(builder, null, dataModel, 0.9, 1.0);
        System.out.println("Score: " + score);
    }
}
