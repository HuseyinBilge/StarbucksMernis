package kodlama.io.starbucksmernis.business.abstracts;

import kodlama.io.starbucksmernis.business.dto.request.create.CreateCustomerRequest;
import kodlama.io.starbucksmernis.business.dto.response.create.CreateCustomerResponse;
import kodlama.io.starbucksmernis.business.dto.response.get.GetAllCustomerResponse;

import java.util.List;

public interface CustomerService {
    List<GetAllCustomerResponse> getAll();
    CreateCustomerResponse add(CreateCustomerRequest request)throws Exception;
}
