package kodlama.io.starbucksmernis.business.concretes;

import kodlama.io.starbucksmernis.business.abstracts.CustomerCheckService;
import kodlama.io.starbucksmernis.business.abstracts.CustomerService;
import kodlama.io.starbucksmernis.business.dto.request.create.CreateCustomerRequest;
import kodlama.io.starbucksmernis.business.dto.response.create.CreateCustomerResponse;
import kodlama.io.starbucksmernis.business.dto.response.get.GetAllCustomerResponse;
import kodlama.io.starbucksmernis.entities.Customer;
import kodlama.io.starbucksmernis.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerManager implements CustomerService {
    private final CustomerRepository repository;
    private final ModelMapper mapper;
    private final CustomerCheckService customerCheckService;

    @Override
    public List<GetAllCustomerResponse> getAll() {
        return repository.findAll()
                .stream()
                .map(customer -> mapper.map(customer, GetAllCustomerResponse.class))
                .toList();
    }

    @Override
    public CreateCustomerResponse add(CreateCustomerRequest request) throws Exception {
        Customer customer = mapper.map(request, Customer.class);
        checkIfIsCustomerRealPerson(customer);
        customer.setId(0);
        repository.save(customer);
        return mapper.map(customer, CreateCustomerResponse.class);
    }

    private void checkIfIsCustomerRealPerson(Customer customer) throws Exception {
        if (!customerCheckService.checkIfRealPerson(customer))
            throw new RuntimeException("Kullanıcı Bilgileri Doğrulanamadı!");
    }
}
