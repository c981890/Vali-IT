package ee.valiit.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin
public class APIController {

    @Autowired
    JdbcTemplate jdbcTemplate;


    // ROUTE
    @GetMapping("/chat/{room}")
        // SELECT * FROM message
    ArrayList<ChatMessage> chat(@PathVariable String room) {
        try {

            String sqlKask = "SELECT * FROM messages WHERE room = '" + room + "';";
            ArrayList<ChatMessage> messages = (ArrayList) jdbcTemplate.query(sqlKask, (resultSet, rowNum) -> {
                String username = resultSet.getString("username");
                String message = resultSet.getString("message");
                String url = resultSet.getString("url");
                return new ChatMessage(username, message, url);
            });
            return messages;
        } catch (DataAccessException err) {
            System.out.println("Table was not ready");
            return  new ArrayList();
        }
    }

    //route sulgudes olev tähtis, et kuskohast info tuleb
    @PostMapping("/chat/{room}/new-message")
    void NewMessage(@RequestBody ChatMessage msg, @PathVariable String room) {

        String sqlKask = "INSERT INTO messages (username, message, room, url) VALUES ('" +
                msg.getUsername() + "', '" +
                msg.getMessage() + "', '" +
                room + "', '" +
                msg.getURL() + "')";

        jdbcTemplate.execute(sqlKask);
    }
}