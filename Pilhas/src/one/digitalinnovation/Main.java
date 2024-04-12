package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

    // criando projeto
    Pilha minhaPilha = new Pilha();

    // acrescentando parâmetros
    minhaPilha.push(new No(1));
    minhaPilha.push(new No(2));
    minhaPilha.push(new No(3));
    minhaPilha.push(new No(4));
    minhaPilha.push(new No(5));
    minhaPilha.push(new No(6));

    // removendo parâmetros
    minhaPilha.pop();
        System.out.println(minhaPilha);
        System.out.println(minhaPilha.top());
    }
}
