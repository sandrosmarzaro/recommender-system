package org.recommender;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

import java.io.File;
import java.io.IOException;

public class Recommended {

    public DataModel getBooksModel() throws IOException {
        return getModel("books.csv");
    }

    public DataModel getMoviesModel() throws IOException {
        return getModel("movies.csv");
    }

    private DataModel getModel(String fileName) throws IOException {
        final String path = "src/main/resources/";
        File file = new File(path + fileName);
        return new FileDataModel(file);
    }
}
