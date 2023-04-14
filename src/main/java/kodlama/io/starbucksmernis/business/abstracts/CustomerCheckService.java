package kodlama.io.starbucksmernis.business.abstracts;

import kodlama.io.starbucksmernis.entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer) throws Exception;
}
