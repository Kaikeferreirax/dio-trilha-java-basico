package one.digitalinnovation;

public class ListaEncadeada<T> {


    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;

    }


    public void add(T conteudo){
        No <T>  novoNo =  new No<>(conteudo);
        if(this.isEmpty()){
             referenciaEntrada = novoNo;
             return;
        }

        No noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size(); i++){

            noAuxiliar = noAuxiliar.getProximoNo();

        }

        noAuxiliar.setProximoNo(novoNo);

    }


    public boolean isEmpty() {
    return referenciaEntrada == null ? true : false;
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;

        while (true) {
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();

                } else{
                    break;
                }
            } else {
                break;
            }

        }

        return tamanhoLista;
    }


}
