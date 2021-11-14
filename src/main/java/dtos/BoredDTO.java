package dtos;

public class BoredDTO {
    private String activity;
    private String type;

    public BoredDTO() {
    }

    public BoredDTO(String activity, String type) {
        this.activity = activity;
        this.type = type;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
