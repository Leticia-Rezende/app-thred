package principal;

import java.util.TreeMap;

public class MainApp {

    public static void main(String[] args) {
        Thread x1 = new Thread (new MinhaTread2());
        Thread x2 = new Thread(new MinhaTread2());
        x1.start();
        x2.start();
        System.out.println("Finalizou a execução das Treads");
    }
}
