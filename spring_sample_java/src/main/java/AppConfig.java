import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nishh.service.CustomerService;
import com.nishh.service.CustomerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name = "CustomerService")
	public CustomerService getCustomerService() {
		return new CustomerServiceImpl();
	}
}
