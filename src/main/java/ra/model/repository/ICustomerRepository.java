package ra.model.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ra.model.entity.Customer;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
