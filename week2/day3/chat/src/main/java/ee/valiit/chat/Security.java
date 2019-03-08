package ee.valiit.chat;

public class Security {
    public static String xssFix(String sisend) {
        return sisend.replace("<", "&lt;"); //HTML kood: less than
    }
}
