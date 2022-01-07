package InterfaceExample;

import java.io.IOException;

public interface UI {

    void showMenu ();
    void setMenuMessage(String s);
    void showMessage();
    void setMessage(String s);
    void close();

    String getChoice() throws IOException;
    String getUserInput() throws IOException;

}
