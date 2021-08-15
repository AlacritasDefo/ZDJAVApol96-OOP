package pl.sda.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class GuestBook {

    private final List<String> nickNames;

    public GuestBook() {
        nickNames = new ArrayList<>();
    }

    public void signUp(String nick) {
        nickNames.add(nick);
    }

    public boolean alreadySignedIn(String nick) {
        for (String nickName : nickNames) {
            if (nickName.equals(nick)) {
                return true;
            }
        }
        return false;
    }
}
