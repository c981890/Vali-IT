package ee.valiit.chat;

public class ChatMessage {
    private int id;
    private String userName;
    private String room;
    private String message;


    public ChatMessage() {

    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getRoom() {
        return room;
    }

    public String getMessage() {
        return message;
    }
}

