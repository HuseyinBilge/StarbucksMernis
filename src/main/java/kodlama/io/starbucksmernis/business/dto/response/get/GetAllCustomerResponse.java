package kodlama.io.starbucksmernis.business.dto.response.get;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetAllCustomerResponse {

    private int id;
    private long nationalIdentity;
    private String firstName;
    private String lastName;
    private int birthYear;
}
