package one.digitalinnovation;

public class Pilha {

    private No refNoEntradaPilha;


    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
     if(!this.isEmpty()){
        No noPoped = refNoEntradaPilha;
        refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        return noPoped;
     }
     return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }


    public boolean isEmpty(){

        return refNoEntradaPilha == null ? true : false;

    }

    @Override
    public String toString(){
        String stringretorno = "-------------------\n";
        stringretorno += "      Pilha \n";
        stringretorno += "--------------------\n";
        No noAuxiliar = refNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null){
                stringretorno += "[No {dado = "+ noAuxiliar.getDado()+ " }] \n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringretorno += "===================\n";
        return stringretorno;

    }



}
