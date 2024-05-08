package model;

public class NewThread extends Thread {
    //Создать класс расширяющий Thread
    //Создать класс NewThread расширяющий Thread.
    //Переопределить метод run(). В цикле for вывести на консоль символ 100 раз.
    //Создать экземпляр класса и запустить новый поток.

    public NewThread(Runnable r) {
        super(r);
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
