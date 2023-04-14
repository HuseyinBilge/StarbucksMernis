package kodlama.io.starbucksmernis.business.dto.response.create;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateCustomerResponse {
    private int id;
    private long nationalIdentity;
    private String firstName;
    private String lastName;
    private int birthYear;
}
