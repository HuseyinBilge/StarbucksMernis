package kodlama.io.starbucksmernis.adapters;

import kodlama.io.starbucksmernis.business.abstracts.CustomerCheckService;
import kodlama.io.starbucksmernis.entities.Customer;
import kodlama.io.starbucksmernis.mernis.RBUKPSPublicSoap;
import org.springframework.stereotype.Service;

@Service
public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        RBUKPSPublicSoap rbukpsPublicSoap = new RBUKPSPublicSoap();
        return
        rbukpsPublicSoap.TCKimlikNoDogrula(customer.getNationalIdentity(), customer.getFirstName(), customer.getLastName(), customer.getBirthYear());

    }
}
