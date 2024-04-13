package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

            Fila<String> minhafila = new Fila();

            minhafila.enqueue("primeiro");
            minhafila.enqueue("segundo");
            minhafila.enqueue("terceiro");
            minhafila.enqueue("quarto");
            minhafila.enqueue("Quinto");

        System.out.println(minhafila);
        System.out.println(minhafila.dequeue());
        System.out.println(minhafila);
    }
}