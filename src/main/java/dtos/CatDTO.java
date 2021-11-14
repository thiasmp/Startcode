package dtos;

public class CatDTO {
    private String fact;

    public CatDTO() {
    }

    public CatDTO(String fact) {
        this.fact = fact;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }
}
