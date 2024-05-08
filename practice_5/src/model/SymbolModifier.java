package model;

//Вывод символа в трех потоках
//Необходимо создать три потока, которые изменяют один и тот же объект. Каждый поток должен вывести на экран одну букву 100 раз, и затем увеличить значение символа на 1.

public class SymbolModifier implements Runnable {
    private static final Object lock = new Object();
    private static char symbol = 'A'; // starting symbol

    private char threadSymbol;

    public SymbolModifier(char threadSymbol) {
        this.threadSymbol = threadSymbol;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 100; i++) {
                System.out.print(threadSymbol); // printing the symbol
            }
            System.out.println(); // new line after printing 100 times
            symbol++; // incrementing the symbol
        }
    }
}
