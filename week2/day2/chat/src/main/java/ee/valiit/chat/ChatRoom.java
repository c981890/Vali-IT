package ee.valiit.chat;

import java.util.*;

public class ChatRoom {
    public String room;
    public ArrayList<ChatMessage> messages = new ArrayList();

    public ChatRoom(String room) {
        this.room = room;
        this.messages.add(new ChatMessage("bot", "kontrollsõnum"));
    }

    public void addMessage(ChatMessage msg) {
        this.messages.add(msg);
    }
}
