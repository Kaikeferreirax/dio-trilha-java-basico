package one.digitalinnovation;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    public ListaDuplamenteEncadeada(){
        primeiroNo = null;
        ultimoNo = null;
        this.tamanhoLista = 0;

    }


    private int tamanhoLista = 0;

    public int size(){

        return tamanhoLista;
    }

}
