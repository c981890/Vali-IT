package ee.valiit.chat;

public class ChatMessage {
    private int id;
    private String username;
    private String room;
    private String message;


    public ChatMessage() {

    }

    public ChatMessage(String username, String message) {
        this.username = username;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return username;
    }

    public String getRoom() {
        return room;
    }

    public String getMessage() {
        return message;
    }
}

