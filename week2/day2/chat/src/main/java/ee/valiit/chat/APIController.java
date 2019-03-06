package ee.valiit.chat;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@CrossOrigin
public class APIController {
    // ChatRoom general = new ChatRoom("general");
    HashMap<String, ChatRoom> rooms = new HashMap();

    public APIController() {
        this.rooms.put("general", new ChatRoom("general"));
        this.rooms.put("random", new ChatRoom ("random"));
        this.rooms.put("materjalid", new ChatRoom ("materjalid"));
    }


    @GetMapping("/chat/{room}")
    ChatRoom chat (@PathVariable String room){
        return this.rooms.get(room);
    }

    @PostMapping("/chat/{room}/new-message")
    void NewMessage(@RequestBody ChatMessage msg, @PathVariable String room) {
        this.rooms.get(room).addMessage(msg);

    }


}
