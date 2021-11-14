package dtos;

public class GenderizeDTO {
    private String name;
    private String gender;
    private String probability;

    public GenderizeDTO() {
    }

    public GenderizeDTO(String name, String gender, String probability) {
        this.name = name;
        this.gender = gender;
        this.probability = probability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProbability() {
        return probability;
    }

    public void setProbability(String probability) {
        this.probability = probability;
    }
}
