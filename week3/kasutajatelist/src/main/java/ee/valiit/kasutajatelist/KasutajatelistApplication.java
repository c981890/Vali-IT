package ee.valiit.kasutajatelist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class KasutajatelistApplication implements CommandLineRunner {
    @Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(KasutajatelistApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sqlKask = "DROP TABLE IF EXISTS kasutajad;"
				+ "CREATE TABLE kasutajad (id SERIAL, nimi TEXT, vanus SMALLINT);";
		jdbcTemplate.execute(sqlKask);
		System.out.println("Kasutajad tabel loodud.");
	}
}
