package kodlama.io.starbucksmernis.api;


import kodlama.io.starbucksmernis.business.abstracts.CustomerService;
import kodlama.io.starbucksmernis.business.dto.request.create.CreateCustomerRequest;
import kodlama.io.starbucksmernis.business.dto.response.create.CreateCustomerResponse;
import kodlama.io.starbucksmernis.business.dto.response.get.GetAllCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/customers")
public class CustomersController {
    private final CustomerService service;

    @GetMapping
    List<GetAllCustomerResponse> getAll(){
        return service.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateCustomerResponse add(@RequestBody CreateCustomerRequest request)throws Exception{
        return service.add(request);
    }
}
