package dk.plaul.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Autowired
	private DataSource dataSource;
	@Override
	public void run(String...args) throws Exception {
		System.out.println("DATASOURCE = " + dataSource);
	}

}
