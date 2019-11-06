import com.google.gson.annotations.SerializedName;

public class Venue {
    @SerializedName("raw")
    private String raw;
    @SerializedName("id")
    private int id;
    Venue(String raw , int id){
        this.raw = raw;
        this.id = id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }
}
