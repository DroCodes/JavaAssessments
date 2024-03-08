package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import controller.BeanConfiguration;
import dmacc.beans.Printers;
import dmacc.repository.PrinterRepository;

@SpringBootApplication
public class Module8AssessmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Module8AssessmentApplication.class, args);
	}
	
	@Autowired
	PrinterRepository repo;

	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Printers p = appContext.getBean("printer", Printers.class);
		p.setManufacturer("Hitachi");
		p.setModel("UX-2");
		p.setSerialNum("123-4567");
		p.setPrice(17000);
		repo.save(p);
		
		List<Printers> allPrinters = repo.findAll();
		
		for(Printers printer : allPrinters) {
			System.out.print(printer.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
}
