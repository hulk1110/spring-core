import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan({"com.nishh"})
@PropertySource("app.properties")
public class AppConfig {

	/*
	 * @Bean(name = "customerService") public CustomerService getCustomerService() {
	 * // CustomerServiceImpl customerServiceImpl = new
	 * CustomerServiceImpl(getCustomerRepository()); CustomerServiceImpl
	 * customerServiceImpl = new CustomerServiceImpl(); //
	 * customerServiceImpl.setCustomerRepository(getCustomerRepository()); return
	 * customerServiceImpl; }
	 */

	/*
	 * @Bean(name = "customerRepository") public CustomerRepository
	 * getCustomerRepository() { return new HibernateCustomerRepositoryImpl(); }
	 */
	@Bean
	public static PropertyPlaceholderConfigurer getPlaceholderConfigurer() {
		
		PropertyPlaceholderConfigurer placeholderConfigurer= new PropertyPlaceholderConfigurer();
		placeholderConfigurer.setLocations(new ClassPathResource("app.properties"));
		return placeholderConfigurer;
	}
}
