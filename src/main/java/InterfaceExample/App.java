package InterfaceExample;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        UIForApp UI = new UIForApp();
        Database Database = new Database();

        Logic Application = new Logic(UI,Database);
        Application.Start();
    }
}
