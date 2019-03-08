package ee.valiit.chat;

public class ChatMessage {
    private int id;
    private String username;
    private String room;
    private String message;
    private String url;


    public ChatMessage() {

    }

    public ChatMessage(String username, String message, String url) {
        this.username = username;
        this.message = message;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return Security.xssFix(username);
    }

    public String getRoom() {
        return room;
    }

    public String getMessage() {

        return Security.xssFix(message);
    }

    public String getURL() {
        return Security.xssFix(url);
    }
}

