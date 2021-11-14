package dtos;

import java.util.ArrayList;

public class RandomUserDTO {
    private ArrayList<String> results = new ArrayList();

    public RandomUserDTO() {
    }

    public RandomUserDTO(ArrayList<String> results) {
        this.results = results;
    }

    public ArrayList<String> getResults() {
        return results;
    }

    public void setResults(ArrayList<String> results) {
        this.results = results;
    }
}
