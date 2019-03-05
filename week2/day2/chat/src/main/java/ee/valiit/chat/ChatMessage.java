package ee.valiit.chat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.*;

public class ChatMessage {
    public String message;
    public String user;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    public Date date;

    public ChatMessage(String user, String message) {
        this.user = user;
        this.message = message;
        this.date = new Date();

    }



}
