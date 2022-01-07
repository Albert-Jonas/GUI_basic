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
    public boolean ResetData() {
        data1 = 0;
        data2 = 0;
        return true;
    }
}

class UIForApp implements UI
{
    private String menu;
    private String message;
    public String choice = "";

    @Override
    public void showMenu() {

        System.out.println(menu);

    }

    @Override
    public void setMenuMessage(String s) { menu = s; }

    @Override
    public void showMessage() {
        System.out.println(message);
    }

    @Override
    public void setMessage(String s) { message = s; }

    @Override
    public void close() { System.exit(0); }

    @Override
    public String getChoice() throws IOException {

        setMenuMessage("Please select the action you want to take:" +
                "\n" +
                "A: Save data" +
                "\n" +
                "B: Reset data" +
                "\n" +
                "X: Exit");

        showMenu();

        switch (choice = getUserInput()) {
            case "A":
                setMessage("Please provide the numbers to store in the database!");
                showMessage();
                break;
            case "B":
                setMessage("You chose reset database!");
                showMessage();
                break;
            case "X":
                setMessage("Thank you, bye!");
                showMessage();
                break;
            default:
                setMessage("Not valid choice" +
                           "\n" +
                           "Please choose again!");
                showMessage();
            }
        return choice;
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

public class Logic {

    Logic(UI a, DatabaseAccess b)
    {
        UI = a;
        Database = b;
    }

    private UI UI;
    private DatabaseAccess Database;

    public void Start() throws IOException
    {
        while(true)
        {
            if ( UI.getChoice() == "A" )
            {
                Database.SaveData(0,0);
            }
            else if (UI.getChoice() == "B")
            {
                Database.ResetData();
            }
            else if ( UI.getChoice() == "X" )
            {
                UI.close();
            }
        }
    }

}
