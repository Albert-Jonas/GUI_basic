package InterfaceExample;

public interface DatabaseAccess {

    void SetData1(int a);
    void SetData2(int a);

    int GetData1();
    int GetData2();

    boolean SaveData(int a,int b);
    boolean ResetData();
}
