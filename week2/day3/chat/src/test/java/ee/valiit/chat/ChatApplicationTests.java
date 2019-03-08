package ee.valiit.chat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChatApplicationTests {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Test
	public void contextLoads() throws Exception {
		ChatApplication ca = new ChatApplication();
		ca.run();
		List<Map<String, Object>>  tables = jdbcTemplate.queryForList("SELECT * FROM pg_catalog.pg_tables;");
		System.out.println(tables);
	}

}
