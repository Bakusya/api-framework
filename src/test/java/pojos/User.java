package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@JsonIgnoreProperties({"created_at","updated_at"})

public class User {


    private int id;
    private String name;
    private String email;
    private String gender;
    private String status;

}
