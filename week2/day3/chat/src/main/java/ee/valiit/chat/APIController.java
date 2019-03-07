package ee.valiit.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin
public class APIController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/chat/{room}")
        // SELECT * FROM message
    ArrayList<ChatMessage> chat(@PathVariable String room) {

        String sqlKask = "SELECT * FROM messages";
        ArrayList<ChatMessage> messages = (ArrayList) jdbcTemplate.query(sqlKask, (resultSet, rowNum) -> {
            String username = resultSet.getString("username");
            String message = resultSet.getString("message");
            return new ChatMessage(username, message);
        });
        return messages;
    }

    @PostMapping("/chat/{room}/new-message")
    void NewMessage(@RequestBody ChatMessage msg, @PathVariable String room) {

    }
}