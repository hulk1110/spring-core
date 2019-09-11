import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nishh.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		// CustomerService customerService= new CustomerServiceImpl();
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService= applicationContext.getBean("customerService",CustomerService.class);
		
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
