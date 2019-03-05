package ee.valiit.chat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.*;

public class ChatMessage {
    private String message;
    private String user;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private Date date;
    private String url;

    public ChatMessage() {

    }

    public ChatMessage(String user, String message, String url) {
        this.user = user;
        this.message = message;
        this.url = url;
        this.date = new Date();

    }


    public String getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }


    public String getUrl() {
        return "<img src=\""+ url +"\" width='50' height=\"60\">";
    }
}
