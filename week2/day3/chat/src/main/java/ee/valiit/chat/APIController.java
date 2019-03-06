package ee.valiit.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin
public class APIController {

    @GetMapping("/chat/{room}")
    void chat(@PathVariable String room) {

    }

    @PostMapping("/chat/{room}/new-message")
    void NewMessage(@RequestBody ChatMessage msg, @PathVariable String room) {

    }
}