package InterfaceExample;

import java.io.IOException;

public interface UI {

    void showMenu ();
    void setMenuMessage(String s);
    void setAfterChoiceMessage(String s);
    void close();

    int getChoice() throws IOException;
    String getUserInput() throws IOException;

}
