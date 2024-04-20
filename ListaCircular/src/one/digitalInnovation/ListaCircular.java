package one.digitalInnovation;

public class ListaCircular<T> {

    private No<T> inicio;
    private No<T> fim;

    private int tamanhoLista;

    public ListaCircular() {
        this.fim = null;
        this.inicio = null;
        this.tamanhoLista = 0;
    }

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

    public T get(int index){
        return this.getNo(index).getConteudo();
    }




    public void remove(int index){

        if (index >= this.tamanhoLista){
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista");
        }

        No<T> noAuxiliar = this.fim;

        if (index == 0){
            this.fim = this.fim.getProximoNo();
            this.inicio.setProximoNo(this.fim);
        }else if(index == 1 ) {
            this.fim.setProximoNo(this.fim.getProximoNo().getProximoNo());
        }else {

            for(int i = 0; i < index -1; i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            noAuxiliar.setProximoNo(noAuxiliar.getProximoNo().getProximoNo());
        }
        tamanhoLista--;

    }



    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }



    public int size(){
        return this.tamanhoLista;
    }




}
