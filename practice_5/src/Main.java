import model.NewRunnable;
import model.NewThread;
import model.SymbolModifier;


public class Main {
    public static void main(String[] args) {
        NewThread t = new NewThread(new NewRunnable());
        t.start();

        new Thread(new NewRunnable()).start();
        new Thread(new NewRunnable()).start();
        NewRunnable r = new NewRunnable();
        r.run();

        new Thread(new SymbolModifier('A')).start();
        new Thread(new SymbolModifier('B')).start();
        new Thread(new SymbolModifier('C')).start();

    }
}