package src.main.java.com.tatiana_belkina.javacore.chapter03.chapter09.MyPack;

/* Теперь класс Balance, его конструктор и его
   show () являются общедоступными. Это означает, что они
   могут использоваться неклассовым кодом вне своего пакета.
*/
public class Balance1 {
    String name;
    double bal;

    public Balance1(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if(bal<0)
            System.out.print("-->> ");
        System.out.println(name + ": $" + bal);
    }
}
