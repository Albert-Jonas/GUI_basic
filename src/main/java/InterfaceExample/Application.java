package InterfaceExample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Database implements DatabaseAccess
{

    private int data1;
    private int data2;

    @Override
    public void SetData1(int a) {  data1 = a;  }

    @Override
    public void SetData2(int a) {  data2 = a;  }

    @Override
    public int GetData1() { return data1; }

    @Override
    public int GetData2() { return data2; }

    @Override
    public boolean SaveData(int a, int b) {
        data1 = a;
        data2 = b;
        return true;
    }

    @Override
    public boolean ResetData(int a, int b) {
        data1 = 0;
        data2 = 0;
        return true;
    }
}

class UIForApp implements UI
{
    private String menu;
    private String afterChoice;

    @Override
    public void showMenu() {

        System.out.println(menu);

    }

    @Override
    public void setMenuMessage(String s) { menu = s; }

    @Override
    public void setAfterChoiceMessage(String s) { afterChoice = s; }

    @Override
    public void close() { System.exit(0); }

    @Override
    public int getChoice() throws IOException {
        boolean stop = false;
        while (!stop)
        {
            switch (getUserInput()) {
                case "A":
                    break;
                case "B":
                    break;
                case "X":
                    stop = true;
            }

        }
        return 0;
    }

    @Override
    public String getUserInput()
            throws IOException
    {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String choice = reader.readLine();

        return choice;
    }
}

public class Application {

    public static UI UI;
    public static DatabaseAccess Database;

    private static void setUI(UI a)
    {
        UI = a;
    }

    private static void setDatabase(DatabaseAccess a)
    {
        Database = a;
    }

    public static void main(String[] args)
    {

        UI UIForApp = new UIForApp();
        setUI(UIForApp);

        UIForApp.setMenuMessage("Please select the action you want to take:" +
                "\n" +
                "A: Save data" +
                "\n" +
                "B: Reset data" +
                "\n" +
                "X: Exit");

        UIForApp.showMenu();
    }

}
