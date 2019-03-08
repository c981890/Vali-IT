package ee.valiit.chat;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChatMessageTests {

    @Test
    public void test1() {
        ChatMessage cm = new ChatMessage("Siil", "Hei hei", "");
        assertEquals("Siil", cm.getUsername());
        assertEquals("Hallo", cm.getMessage());
    }
}
