import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nishh.repository.CustomerRepository;
import com.nishh.repository.HibernateCustomerRepositoryImpl;
import com.nishh.service.CustomerService;
import com.nishh.service.CustomerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl  customerServiceImpl= new CustomerServiceImpl();
		customerServiceImpl.setCustomerRepository(getCustomerRepository());
		return customerServiceImpl;
	}
	
	
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
}