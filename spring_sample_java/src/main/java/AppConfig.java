import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nishh.repository.CustomerRepository;
import com.nishh.repository.HibernateCustomerRepositoryImpl;

@Configuration
public class AppConfig {

	@Bean(name="CustomerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
}
