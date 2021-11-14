package dtos;

public class DogDTO {
    private String message;

    public DogDTO() {
    }

    public DogDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
