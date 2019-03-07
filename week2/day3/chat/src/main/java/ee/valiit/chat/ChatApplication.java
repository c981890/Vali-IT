package ee.valiit.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ChatApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ChatApplication.class, args);
    }

    @Autowired // käsk: ühenda klass
    JdbcTemplate jdbcTemplate;


    @Override
    public void run(String... args) throws Exception {
        jdbcTemplate.execute("DROP TABLE IF EXISTS messages");
        jdbcTemplate.execute("CREATE TABLE messages (id INTEGER PRIMARY KEY," +
                                                        "username TEXT, " +
                                                        "message TEXT, " +
                                                        "room TEXT)");
    }
}
