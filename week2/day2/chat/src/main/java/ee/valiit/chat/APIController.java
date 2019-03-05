package ee.valiit.chat;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class APIController {
    ChatRoom general = new ChatRoom("general");

    @GetMapping("/chat/general")
    ChatRoom chat (){
        return general;
    }

    @PostMapping("/chat/general/new-message")
    void NewMessage(@RequestBody ChatMessage msg) {
        this.general.addMessage(msg);

    }


}
