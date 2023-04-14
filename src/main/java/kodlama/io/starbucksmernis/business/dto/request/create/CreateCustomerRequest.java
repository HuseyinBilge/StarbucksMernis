package kodlama.io.starbucksmernis.business.dto.request.create;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateCustomerRequest {
    private long nationalIdentity;
    private String firstName;
    private String lastName;
    private int birthYear;
}
