package one.digitalInnovation;

public class ListaCircular<T> {

    private No<T> inicio;
    private No<T> fim;

    private int tamanhoLista = 0;


    private No<T> getNo(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("O índice não pode ser encontrado pois a lista está vazia");
        if(index == 0){
            return this.fim;

        }
        No<T> noAuxiliar = this.fim;
        for(int i = 0; (i < index) && (noAuxiliar != null) ; i++){
            noAuxiliar = noAuxiliar.getProximoNo();

        }
        return noAuxiliar;
    }

    private T get(int index){
        return this.getNo(index).getConteudo();
    }





    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }



    public int size(){
        return this.tamanhoLista;
    }




}
